package uk.ac.belfastmet.top10list.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.top10list.service.AnimalService;

@Controller
@RequestMapping
public class AnimalController {
	
	@GetMapping()
	public String homepage(Model model) {
		
		model.addAttribute("pageTitle", "HomePageAnimals");
		model.addAttribute("numberOfAnimals", "Top 10 fastest animals");
		AnimalService animalService = new AnimalService();
		model.addAttribute("animals", animalService.getAnimals());
		
		
		return "index";
	}

}
