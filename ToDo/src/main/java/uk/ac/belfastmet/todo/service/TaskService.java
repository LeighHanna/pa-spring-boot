package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.domain.Task;

@Service
public class TaskService {
	private ArrayList<Task> tasks;
	
	/**
	 * method to create and receive a array list of tasks and their data for tables
	 * @return
	 */
	public ArrayList<Task> getTasks()
	{
		 this.tasks = new ArrayList<Task>();
		 
		 //creating and adding all tasks
		 this.tasks.add(new Task("Go shopping", "Go to asda get milk and bread", "24/09/2019", false, "Leigh Hanna", "low"));
		 this.tasks.add(new Task("MTA test", "go to titanic at 17:20", "29/09/2019", false, "Leigh Hanna", "high"));
		 this.tasks.add(new Task("Go shopping", "Go to asda get milk and bread", "19/09/2019", true, "Leigh Hanna", "low"));
		 this.tasks.add(new Task("Visit bob", "good old bob", "24/10/2019", false, "Leigh Hanna", "low"));
		 this.tasks.add(new Task("Visit bob", "Gain revenge on bob", "25/10/2019", false, "Leigh Hanna", "Medium"));
		 this.tasks.add(new Task("hide bob", "bury the evidence", "26/10/2019", false, "Not Leigh Hanna", "High"));
		 this.tasks.add(new Task("meet friends", "establish the alibi", "26/10/2019", false, "Not Leigh Hanna", "High"));
		 this.tasks.add(new Task("study java", "make a list program", "27/10/2019", false, "Leigh Hanna", "low"));
		 this.tasks.add(new Task("Go shopping", "Go to asda get milk and bread", "28/09/2019", false, "Leigh Hanna", "low"));
		 this.tasks.add(new Task("Go to jail", "they caught me", "01/11/2019", false, "Leigh Hanna", "High"));
		 
		 //returning the populated list
		 return this.tasks;
	}
	
	/**
	 * method to create and receive a array list of tasks and their data for tables only completed
	 * @return
	 */
	public ArrayList<Task> getTasksCompleted()
	{
		 ArrayList<Task> tasksNew = new ArrayList<Task>();
		 getTasks();
		 
		 //creating and adding all tasks
		 for(Task task : tasks)
		 {
			 if(task.isComplete())
			 {
				 tasksNew.add(task);
			 }
		 }
		 
		 //returning the populated list
		 return tasksNew;
	}
	
	/**
	 * method to create and receive a array list of tasks and their data for tables only non completed
	 * @return
	 */
	public ArrayList<Task> getTasksToDo()
	{
		 ArrayList<Task> tasksNew = new ArrayList<Task>();
		 getTasks();
		 
		 //creating and adding all tasks
		 for(Task task : tasks)
		 {
			 if(task.isComplete())
			 {
				 
			 }
			 else
			 {
				 tasksNew.add(task);
			 }
		 }
		 
		 //returning the populated list
		 return tasksNew;
	}
}
