package com.dlizarra.ideahub.idea;

import java.util.List;

public interface IdeaService {

	IdeaDto createIdea(IdeaDto dto, Integer creatorId);

	void updateIdea(IdeaDto ideaDto);

	void deleteIdea(Integer id);

	IdeaDto getIdea(Integer id);

	List<IdeaDto> getIdeas();

	void addFollower(Integer projectId, Integer userId);

}
