package com.dlizarra.ideahub.project;

import com.dlizarra.ideahub.support.jpa.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CustomJpaRepository<Project, Integer> {

}
