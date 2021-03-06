package com.dlizarra.ideahub.idea;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.dlizarra.ideahub.user.UserDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(of = { "name", "description" })
@ToString(of = { "id", "name" })
@Setter
@Getter
@JsonPropertyOrder({ "id", "members", "creator" })
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class IdeaDto {

	private Integer id;

	@Size(max = Idea.MAX_LENGTH_NAME)
	private String name;

	@Size(max = Idea.MAX_LENGTH_DESCRIPTION)
	private String description;

	private UserDto creator;
	private List<UserDto> followers = new ArrayList<UserDto>();
	private LocalDateTime creationTime;
	private LocalDateTime modificationTime;

}
