package com.dlizarra.ideahub.idea;

import com.dlizarra.ideahub.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping(AppConfig.REST_BASE_URL)
public class IdeaController {

	@Autowired
	private IdeaService ideaService;

	@RequestMapping(value = "/ideas", method = RequestMethod.GET)
	public List<IdeaDto> findAll() {
		return ideaService.getIdeas();
	}

	@RequestMapping(value = "/ideas/{id}", method = RequestMethod.GET)
	public IdeaDto find(@PathVariable("id") int id) {
		return ideaService.getIdea(id);
	}

	@RequestMapping(value = "/ideas", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@PreAuthorize("hasRole('USER')")
	public void create(@Valid @RequestBody final IdeaDto ideaDto) {
		ideaService.createIdea(ideaDto, 1);
	}

	@RequestMapping(value = "/addMember", method = RequestMethod.PUT)
	public void addMember(@Valid @RequestBody final IdeaDto ideaDto) {
		ideaService.addFollower(ideaDto.getId(), 1);
	}

	@RequestMapping(value = "/ideas/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable final Integer id, @Valid @RequestBody final IdeaDto ideaDto) {
		ideaService.updateIdea(ideaDto);
	}

}
