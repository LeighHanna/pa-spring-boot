package uk.ac.belfastmet.ToyStory.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by tom hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by tim allen";
	}
}
