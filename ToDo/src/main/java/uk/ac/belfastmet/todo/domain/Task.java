package uk.ac.belfastmet.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "task")
public class Task {
	
	//Variables
	long id;
	String name;
	String description;
	String deadline;
	boolean complete;
	String assignedPerson;
	String priority;
	
	//constructor
	public Task(String name, String description, String deadline, boolean complete, String assignedPerson, String priority) {
		super();
		this.name = name;
		this.description = description;
		this.deadline = deadline;
		this.complete = complete;
		this.assignedPerson = assignedPerson;
		this.priority = priority;
	}
	
	//Gets and Sets
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "deadline")
	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	@Column(name = "complete")
	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Column(name = "assignedPerson")
	public String getAssignedPerson() {
		return assignedPerson;
	}

	public void setAssignedPerson(String assignedPerson) {
		this.assignedPerson = assignedPerson;
	}

	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	public String toString() {
		return ("name:" + name + ", deadline:" + deadline+ ", complete:" + complete + ", assignedPerson:" + assignedPerson + ", priority:" + priority);
	}
	
	
	

}
