package com.ksm.robolo.roboloapp.domain;

import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ksm.robolo.roboloapp.enums.TaskStatus;

@Entity
@Table(name = "Tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String description;
	
	private Period estimatedTaskDuration;
	
	@ManyToMany(targetEntity = Worker.class)
	private Set<Worker> workersSet;
	
	@ManyToOne
	private Project project;
	
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	private TaskStatus status;
	
	@OneToMany(targetEntity = TaskItem.class)
	private List<TaskItem> taskItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Period getEstimatedTaskDuration() {
		return estimatedTaskDuration;
	}

	public void setEstimatedTaskDuration(Period estimatedTaskDuration) {
		this.estimatedTaskDuration = estimatedTaskDuration;
	}

	public Set<Worker> getWorkersSet() {
		return workersSet;
	}

	public void setWorkersSet(Set<Worker> workersSet) {
		this.workersSet = workersSet;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public List<TaskItem> getTaskItems() {
		return taskItems;
	}

	public void setTaskItems(List<TaskItem> taskItems) {
		this.taskItems = taskItems;
	}
}
