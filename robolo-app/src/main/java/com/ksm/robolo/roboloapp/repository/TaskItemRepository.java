package com.ksm.robolo.roboloapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ksm.robolo.roboloapp.domain.TaskItem;

public interface TaskItemRepository extends CrudRepository<TaskItem, Long> {

}
