package com.ksm.robolo.roboloapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ksm.robolo.roboloapp.domain.ProjectEntity;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {
	
	List<ProjectEntity> findAll();
}
