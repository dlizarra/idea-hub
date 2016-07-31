package com.dlizarra.ideahub.idea;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.dlizarra.ideahub.user.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.dlizarra.ideahub.support.AbstractUnitTest;
import com.dlizarra.ideahub.support.orika.OrikaBeanMapper;
import com.dlizarra.ideahub.user.UserRepository;

@Transactional
public class IdeaServiceTest extends AbstractUnitTest {

	@Mock
	private IdeaRepository ideaRepository;
	@Mock
	private UserRepository userRepository;

	@Autowired
	@Spy
	private OrikaBeanMapper mapper;

	@InjectMocks
	private IdeaServiceImpl projectService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		final Idea p1 = new Idea();
		p1.setId(1);
		p1.setName("Project1");
		p1.setDescription("Description for Project1");
		final Idea p2 = new Idea();
		p2.setId(2);
		p2.setName("Project2");
		p2.setDescription("Description for Project2");
		final List<Idea> ideas = new ArrayList<>();
		ideas.add(p1);
		ideas.add(p2);
		User user1 = new User();
		user1.setId(1);

		when(ideaRepository.findAll(any(Sort.class))).thenReturn(ideas);
		when(ideaRepository.findOne(1)).thenReturn(Optional.of(p1));
		when(ideaRepository.findOne(5)).thenReturn(Optional.empty());
		when(ideaRepository.findOne(199)).thenReturn(Optional.of(p1));
		when(ideaRepository.save(any(Idea.class))).thenReturn(p1);
		when(userRepository.findOne(1)).thenReturn(Optional.of(user1));
	}

	@Test
	public void testGetProjects_TwoProjectsInDb_ShouldReturnTwoProjects() {
		// act
		final List<IdeaDto> projects = projectService.getIdeas();
		// assert
		assertThat(projects.size()).isEqualTo(2);

	}

	@Test
	public void testGetProject_ExistingIdGiven_ShouldReturnProject() {
		// act
		final IdeaDto p = projectService.getIdea(1);
		// assert
		assertThat(p.getName()).isEqualTo("Project1");
	}

	@Test(expected = IdeaNotFoundException.class)
	public void testGetProject_NonExistingIdGiven_ShouldThrowProjectNotFoundException() {
		projectService.getIdea(5);
	}

	@Test
	public void testCreateProject_ProjectGiven_ShouldSaveProject() {
		// arrange
		final IdeaDto savedDto = new IdeaDto();
		savedDto.setName("Project1");
		savedDto.setDescription("Description for Project1");
		// act
		final IdeaDto dto = projectService.createIdea(savedDto, 1);
		// assert
		assertThat(dto.getId()).isEqualTo(1);
	}

	 @Test
	 public void testDeleteProject_ValidIdGiven_ShouldDeleteProject(){
	 	// act
	 	projectService.deleteIdea(1);
	 	// assert
	 	verify(ideaRepository).delete(1);
	 }

}
