package uk.ac.belfastmet.todo.domain;


public class Task {
	
	//Variables
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public String getAssignedPerson() {
		return assignedPerson;
	}

	public void setAssignedPerson(String assignedPerson) {
		this.assignedPerson = assignedPerson;
	}

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
