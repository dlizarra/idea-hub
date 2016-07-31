package com.dlizarra.ideahub.idea;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.dlizarra.ideahub.support.AbstractWebIntegrationTest;

public class IdeaRepositoryTest extends AbstractWebIntegrationTest {

	@Autowired
	private IdeaRepository ideaRepository;

	@Test
	public void save_ProjectGiven_ShouldSaveProject() {
		// arrange
		final Idea idea = new Idea();
		idea.setName("Idea test");
		// act
		ideaRepository.save(idea);
		// assert
		assertThat(idea.getId()).isNotNull();
	}

	@Sql({ "classpath:/sql/cleanup.sql", "classpath:/sql/idea.sql" })
	@Test
	public void update_ExistingProjectGiven_ShouldUpdateProject() {
		// arrange
		final Idea p = new Idea();
		p.setId(2);
		p.setName("Idea updated");
		// act
		final Idea updatedIdea = ideaRepository.save(p);
		// assert
		assertThat(updatedIdea.getName()).isEqualTo(p.getName());
		assertThat(updatedIdea.getId()).isEqualTo(p.getId());
	}

	@Test
	public void findOne_ExistingIdGiven_ShouldReturnProject() {
		final Optional<Idea> projectOpt = ideaRepository.findOne(1);
		assertThat(projectOpt.isPresent()).isTrue();
		final Idea idea = projectOpt.get();
		// assert
		assertThat(idea.getName()).isEqualTo("Project1");
	}

	@Transactional
	@Test
	public void getOne_ExistingIdGiven_ShouldReturnLazyEntity() {
		// act
		final Idea p = ideaRepository.getOne(1);
		// assert
		assertThat(p).isNotNull();
		assertThat(p.getId()).isEqualTo(1);
	}

	@Sql({ "classpath:/sql/cleanup.sql", "classpath:/sql/idea.sql" })
	@Test
	public void findAll_TwoProjectsInDb_ShouldReturnTwoProjects() {
		// act
		final List<Idea> allIdeas = ideaRepository.findAll();
		// assert
		assertThat(allIdeas.size()).isEqualTo(2);
	}

	@Sql({ "classpath:/sql/cleanup.sql", "classpath:/sql/idea.sql" })
	@Test
	public void delete_ExistingIdGiven_ShouldDeleteProject() {
		// act
		ideaRepository.delete(2);
		// assert
		assertThat(ideaRepository.findAll().size()).isEqualTo(1);
	}

}
