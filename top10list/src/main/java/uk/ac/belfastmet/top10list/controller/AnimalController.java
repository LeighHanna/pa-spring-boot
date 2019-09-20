package uk.ac.belfastmet.top10list.controller;






import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.top10list.service.AnimalService;
//first hit - the doorman : in or out requests 
@Controller
@RequestMapping
public class AnimalController {
	
	Logger logger = LoggerFactory.getLogger(AnimalController.class);
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String homepage(Model model) {
		logger.info("Here homepage");
		model.addAttribute("pageTitle", "HomePageAnimals");
		model.addAttribute("numberOfAnimals", "Top 10 fastest animals");
		AnimalService animalService = new AnimalService();
		model.addAttribute("animals", animalService.getAnimals());
		
		
		return "index";
	}

}
