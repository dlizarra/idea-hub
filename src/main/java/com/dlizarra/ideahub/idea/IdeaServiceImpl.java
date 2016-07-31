package com.dlizarra.ideahub.idea;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlizarra.ideahub.support.orika.OrikaBeanMapper;
import com.dlizarra.ideahub.user.User;
import com.dlizarra.ideahub.user.UserDto;
import com.dlizarra.ideahub.user.UserNotFoundException;
import com.dlizarra.ideahub.user.UserRepository;

@Service
public class IdeaServiceImpl implements IdeaService {

	@Autowired
	private OrikaBeanMapper mapper;
	@Autowired
	private IdeaRepository ideaRepository;
	@Autowired
	private UserRepository userRepository;

	@Transactional
	@Override
	public IdeaDto createIdea(final IdeaDto dto, final Integer creatorId) {
		final Idea idea = mapper.map(dto, Idea.class);
		final User creator = userRepository.findOne(creatorId)
				.orElseThrow(() -> new UserNotFoundException(creatorId));

		// we keep in sync both sides of the relationship idea-user
		creator.getIdeasFollowed().add(idea);
		idea.getFollowers().add(creator);
		idea.setCreator(creator);
		final Idea saved = ideaRepository.save(idea);

		return mapper.map(saved, IdeaDto.class);
	}

	@Transactional
	@Override
	public void addFollower(final Integer projectId, final Integer followerId) {
		final Idea idea = find(projectId);
		final User user = userRepository.findOne(followerId)
				.orElseThrow(() -> new UserNotFoundException(followerId));

		// we keep in sync both sides of the relationship idea-user
		user.getIdeasFollowed().add(idea);
		mapper.map(user, UserDto.class);
		idea.getFollowers().add(user);
	}

	@Transactional
	@Override
	public void updateIdea(final IdeaDto ideaDto) {
		// TODO Auto-generated method stub

	}

	@Transactional
	@Override
	public void deleteIdea(final Integer id) {
		ideaRepository.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<IdeaDto> getIdeas() {
		final List<IdeaDto> projectsDto = new ArrayList<IdeaDto>();
		final List<Idea> ideas = ideaRepository.findAll(new Sort("id"));
		ideas.forEach(x -> projectsDto.add(mapper.map(x, IdeaDto.class)));

		return projectsDto;
	}

	@Transactional(readOnly = true)
	@Override
	public IdeaDto getIdea(final Integer id) {
		return mapper.map(find(id), IdeaDto.class);
	}

	@Transactional(readOnly = true)
	private Idea find(final Integer id) {
		final Optional<Idea> projectOpt = ideaRepository.findOne(id);
		return projectOpt.orElseThrow(() -> new IdeaNotFoundException(id));
	}
}
