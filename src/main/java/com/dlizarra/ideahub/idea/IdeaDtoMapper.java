package com.dlizarra.ideahub.idea;

import org.springframework.stereotype.Component;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;

@Component
public class IdeaDtoMapper extends CustomMapper<Idea, IdeaDto> {

	@Override
	public void mapAtoB(final Idea idea, final IdeaDto ideaDto, final MappingContext context) {
		// ideaDto.getCreator().setIdeasFollowed(new ArrayList<IdeaDto>());
		// ideaDto.getMembers().forEach(member -> member.setIdeasFollowed(new ArrayList<IdeaDto>()));
	}

}
