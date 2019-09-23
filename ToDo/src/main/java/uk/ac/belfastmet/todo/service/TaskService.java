package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.domain.Task;

@Service
public class TaskService {
	private ArrayList<Task> tasks;
	
	
	public ArrayList<Task> getTasks()
	{
		 this.tasks = new ArrayList<Task>();
		 
		 this.tasks.add(new Task("Go shopping", "Go to asda get milk and bread", "24/09/2019", false, "Leigh Hanna", "low"));
		 
		 
		 return this.tasks;
	}
}
