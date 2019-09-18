package uk.ac.belfastmet.DwarfWebSite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.DwarfWebSite.service.DwarfService;

@Controller
@RequestMapping
public class DwarfsController {
	
	@GetMapping()
	public String homepage(Model model) {
		
//		model.addAttribute("pageTitle", "HomePage");
//		model.addAttribute("numberOfDwarfs", "20  total dwarfs");
//		DwarfService dwarfService = new DwarfService();
//		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
//		
		
		return "index";
	}
	
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		
		
		model.addAttribute("pageTitle", "Disney Dwarfs");
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		
		return "disney";
	}
	
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		
		model.addAttribute("pageTitle", "Tolkien Dwarfs");
		
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		return "tolkien";
	}

}
