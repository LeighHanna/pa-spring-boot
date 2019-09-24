package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.controller.TaskController;
import uk.ac.belfastmet.todo.domain.Task;
import uk.ac.belfastmet.todo.repository.TaskRepository;

@Service
public class TaskService {
	private ArrayList<Task> tasks;
	Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	@Autowired
	private TaskRepository taskRepository;
	
	public void getNumberOfTasks()
	{
		Iterable < Task > tasksI = taskRepository.findAll();
		Iterator < Task > iterator = tasksI.iterator();
		
		while (iterator.hasNext())
		{
			logger.info("{}", iterator.next().toString());
		}
		
		logger.info("# of tasks: {}", taskRepository.count());
	}
	
	// method to create and receive a array list of tasks and their data for tables
	public ArrayList<Task> getTasks()
	{
		
		 this.tasks = new ArrayList<Task>();
		 
		 //creating and adding all tasks
//		 this.tasks.add(new Task("Go shopping", "Go to asda get milk and bread", "24/09/2019", "false", "Leigh Hanna", "low"));
//		 this.tasks.add(new Task("MTA test", "go to titanic at 17:20", "29/09/2019", "false", "Leigh Hanna", "high"));
//		 this.tasks.add(new Task("Go shopping", "Go to asda get milk and bread", "19/09/2019", "true", "Leigh Hanna", "low"));
//		 this.tasks.add(new Task("Visit bob", "good old bob", "24/10/2019", "false", "Leigh Hanna", "low"));
//		 this.tasks.add(new Task("Visit bob", "Gain revenge on bob", "25/10/2019", "false", "Not Leigh Hanna", "Medium"));
//		 this.tasks.add(new Task("hide bob", "bury the evidence", "26/10/2019", "false", "Not Leigh Hanna", "High"));
//		 this.tasks.add(new Task("meet friends", "establish the alibi", "26/10/2019", "false", "Not Leigh Hanna", "High"));
//		 this.tasks.add(new Task("study java", "make a list program", "27/10/2019", "false", "Leigh Hanna", "low"));
//		 this.tasks.add(new Task("Go shopping", "Go to asda get milk and bread", "28/09/2019", "false", "Leigh Hanna", "low"));
//		 this.tasks.add(new Task("Go to jail", "they caught me", "01/11/2019", "false", "Leigh Hanna", "High"));
		 
		 //returning the populated list
		 getNumberOfTasks();
		 logger.info("List populated - getTasks()");
		 logger.debug(tasks.size() + " :tasks in ArrayList tasks");
		 return this.tasks;
	}
	
	//method to create and receive a array list of tasks and their data for tables only completed 
	public ArrayList<Task> getTasksCompleted()
	{
		 ArrayList<Task> tasksNew = new ArrayList<Task>();
		 getTasks();
		 
		 //creating and adding all tasks
		 for(Task task : tasks)
		 {
			 if(task.getComplete() == "true")
			 {
				 tasksNew.add(task);
			 }
		 }
		 
		 //returning the populated list
		 logger.info("List populated - getTasksCompleted()");
		 logger.debug(tasks.size() + " :tasks in ArrayList tasks");
		 return tasksNew;
	}
	
	
	//method to create and receive a array list of tasks and their data for tables only non completed
	public ArrayList<Task> getTasksToDo()
	{
		 ArrayList<Task> tasksNew = new ArrayList<Task>();
		 getTasks();
		 
		 //creating and adding all tasks
		 for(Task task : tasks)
		 {
			 if(task.getComplete() == "true")
			 {
				 
			 }
			 else
			 {
				 tasksNew.add(task);
			 }
		 }
		 
		 //returning the populated list
		 logger.info("List populated - getTasksToDo()");
		 logger.debug(tasks.size() + " :tasks in ArrayList tasks");
		 return tasksNew;
	}
}
