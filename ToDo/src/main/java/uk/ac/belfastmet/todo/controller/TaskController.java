package uk.ac.belfastmet.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todo.service.TaskService;

@Controller
@RequestMapping
public class TaskController {
	
	Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	/**
	 * This method is what happens for the default webpage
	 * @param model
	 * @return
	 */
	@RequestMapping(value="", method = RequestMethod.GET)
	public String homepage(Model model) {
		//text assignment for page
		logger.info("Homepage loaded");
		model.addAttribute("pageTitle", "Task Home Page");
		model.addAttribute("taskpgDescription", "A complete list of tasks");
		//getting task info for table population
		TaskService taskService = new TaskService();
		model.addAttribute("tasks", taskService.getTasks());
		logger.info("Tasks method run");
		
		
		return "index";
	}
	
	/**
	 * This method is what happens for the completed webpage
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/completed", method = RequestMethod.GET)
	public String completed(Model model) {
		//text assignment for page
		logger.info("completedPage loaded");
		model.addAttribute("pageTitle", "Completed Page");
		model.addAttribute("taskpgDescription", "A complete list of completed tasks");
		//getting task info for table population
		TaskService taskService = new TaskService();
		model.addAttribute("tasks", taskService.getTasksCompleted());
		logger.info("Tasks completed method run");
		
		
		return "index";
	}
	
	/**
	 * This method is what happens for the todo webpage
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/todo", method = RequestMethod.GET)
	public String todo(Model model) {
		//text assignment for page
		logger.info("completedPage loaded");
		model.addAttribute("pageTitle", "ToDo Page");
		model.addAttribute("taskpgDescription", "A complete list of tasks still todo");
		//getting task info for table population
		TaskService taskService = new TaskService();
		model.addAttribute("tasks", taskService.getTasksToDo());
		logger.info("Tasks todo method run");
		
		
		return "index";
	}
	
	/**
	 * This method is what happens for the alltasks webpage
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/alltasks", method = RequestMethod.GET)
	public String alltasks(Model model) {
		//text assignment for page
		logger.info("completedPage loaded");
		model.addAttribute("pageTitle", "All Tasks Page");
		model.addAttribute("taskpgDescription", "A complete list of tasks");
		//getting task info for table population
		TaskService taskService = new TaskService();
		model.addAttribute("tasks", taskService.getTasks());
		logger.info("Tasks todo method run");
		
		
		return "index";
	}
}