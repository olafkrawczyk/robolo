package com.ksm.robolo.roboloapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ksm.robolo.roboloapp.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
