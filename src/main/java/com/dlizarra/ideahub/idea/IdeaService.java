package com.dlizarra.ideahub.idea;

import java.util.List;

public interface IdeaService {

	IdeaDto createProject(IdeaDto dto, Integer creatorId);

	void updateProject(IdeaDto project);

	void deleteProject(Integer id);

	IdeaDto getProject(Integer id);

	List<IdeaDto> getProjects();

	void addMember(Integer projectId, Integer userId);

}
