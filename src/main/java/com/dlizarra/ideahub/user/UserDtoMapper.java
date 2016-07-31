package com.dlizarra.ideahub.user;

import org.springframework.stereotype.Component;

import ma.glasnost.orika.CustomMapper;

@Component
public class UserDtoMapper extends CustomMapper<User, UserDto> {
	// @Override
	// public void mapAtoB(final User user, final UserDto userDto, final MappingContext context) {
	// userDto.getIdeasFollowed().forEach(p -> {
	// if (p.getCreator() != null) {
	// p.getCreator().setIdeasFollowed(new ArrayList<IdeaDto>());
	// }
	// p.setMembers(new ArrayList<UserDto>());
	// });

	// userDto.getIdeasFollowed().forEach(p -> {
	// if (p.getCreator() != null) {
	// p.getCreator().setIdeasFollowed(new ArrayList<IdeaDto>());
	// }
	// p.setMembers(new ArrayList<UserDto>());
	// });
	// }

}
