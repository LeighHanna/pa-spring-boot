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
	
	/**
	 * This method is what happens for the default webpage
	 * @param model
	 * @return
	 */
	@RequestMapping(value="", method = RequestMethod.GET)
	public String homepage(Model model) {
		logger.info("Home");
		model.addAttribute("pageTitle", "HomePageAnimals");
		model.addAttribute("numberOfAnimals", "Top 10 fastest animals");
		AnimalService animalService = new AnimalService();
		model.addAttribute("animals", animalService.getAnimals());
		
		
		return "index";
	}
	
	@RequestMapping(value="/fish", method = RequestMethod.GET)
	public String fishpage(Model model) {
		logger.info("Fish");
		model.addAttribute("pageTitle", "HomePageAnimals");
		model.addAttribute("numberOfAnimals", "Top 2 fastest fish");
		AnimalService animalService = new AnimalService();
		model.addAttribute("animals", animalService.getAnimalsFish());
		
		
		return "index";
	}
	
	@RequestMapping(value="/bird", method = RequestMethod.GET)
	public String birdpage(Model model) {
		logger.info("Bird");
		model.addAttribute("pageTitle", "HomePageAnimals");
		model.addAttribute("numberOfAnimals", "Top 5 fastest birds");
		AnimalService animalService = new AnimalService();
		model.addAttribute("animals", animalService.getAnimalsBirds());
		
		
		return "index";
	}
	
	@RequestMapping(value="/mammal", method = RequestMethod.GET)
	public String mammalpage(Model model) {
		logger.info("Mammal");
		model.addAttribute("pageTitle", "HomePageAnimals");
		model.addAttribute("numberOfAnimals", "Top 3 fastest mammals");
		AnimalService animalService = new AnimalService();
		model.addAttribute("animals", animalService.getAnimalsMammals());
		
		
		return "index";
	}

}
