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
		model.addAttribute("pageTitle", "HomePage");
		model.addAttribute("taskpgDescription", "A complete list of tasks");
		//getting task info for table population
		TaskService taskService = new TaskService();
		model.addAttribute("tasks", taskService.getTasks());
		logger.info("Tasks method run");
		
		
		return "index";
	}
}