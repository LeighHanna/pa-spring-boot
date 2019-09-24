package uk.ac.belfastmet.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todo.service.TaskService;

@Controller
@RequestMapping
public class TaskController {
	String wMessage = "Welcome to @@stickynote@@ Please Login";
	Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	@Autowired
	TaskService taskService;
		/**
	 * This method is what happens for the default webpage
	 * @param model
	 * @return HTML page index
	 */
	@RequestMapping(value="", method = RequestMethod.GET)
	public String homepage(Model model) {
		//text assignment for page
		logger.info("Homepage loaded");
		model.addAttribute("pageTitle", "Task Home Page");
		model.addAttribute("taskpgDescription", wMessage);
		//getting task info for table population
		
		logger.info("");
		
		
		return "index";
	}
	
	/**
	 * This method is what happens for the completed webpage
	 * @param model
	 * @return HTML page completed
	 */
	@RequestMapping(value="/completed", method = RequestMethod.GET)
	public String completed(Model model) {
		//text assignment for page
		logger.info("completedPage loaded");
		model.addAttribute("pageTitle", "Completed Page");
		model.addAttribute("taskpgDescription", "A complete list of completed tasks");
		//getting task info for table population
		model.addAttribute("tasks", taskService.getTasksCompleted());
		logger.info("Tasks completed method run");
		
		
		return "completed";
	}
	
	/**
	 * This method is what happens for the todo webpage
	 * @param model
	 * @return HTML page todo
	 */
	@RequestMapping(value="/todo", method = RequestMethod.GET)
	public String todo(Model model) {
		//text assignment for page
		logger.info("todoPage loaded");
		model.addAttribute("pageTitle", "ToDo Page");
		model.addAttribute("taskpgDescription", "A complete list of tasks still todo");
		//getting task info for table population
		model.addAttribute("tasks", taskService.getTasksToDo());
		logger.info("Tasks todo method run");
		
		
		return "todo";
	}
	
	/**
	 * This method is what happens for the alltasks webpage
	 * @param model
	 * @return HTML page alltasks
	 */
	@RequestMapping(value="/alltasks", method = RequestMethod.GET)
	public String alltasks(Model model) {
		//text assignment for page
		logger.info("alltasksPage loaded");
		model.addAttribute("pageTitle", "All Tasks Page");
		model.addAttribute("taskpgDescription", "A complete list of tasks");
		//getting task info for table population
		taskService.getTasks();
		model.addAttribute("tasks", taskService.getTasks());
		logger.info("Tasks todo method run");
		
		
		return "alltasks";
	}
}