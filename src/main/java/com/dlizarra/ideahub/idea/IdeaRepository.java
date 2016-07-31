package com.dlizarra.ideahub.idea;

import com.dlizarra.ideahub.support.jpa.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends CustomJpaRepository<Idea, Integer> {

}
