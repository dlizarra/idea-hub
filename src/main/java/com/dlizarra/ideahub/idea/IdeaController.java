package com.dlizarra.ideahub.idea;

import java.util.List;

import javax.validation.Valid;

import com.dlizarra.ideahub.AppConfig;
import com.dlizarra.ideahub.support.logging.AspectLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(AppConfig.REST_BASE_URL)
public class IdeaController {

	@Autowired
	private IdeaService ideaService;

	private static final Logger log = LoggerFactory.getLogger(AspectLogger.class);


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
