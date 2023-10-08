package com.example.demo;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	private AlienRepo repo;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("getAliens")
	public String getAliens(Model m)
	{
		
		m.addAttribute("response", repo.findAll());
		return "allNames";
		
	}
	
	@PostMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m)
	{
		List<Alien> aliens= Arrays.asList(new Alien(101,"Swapnil"), new Alien(102,"ABC"));
		m.addAttribute("result",new Alien(aid,"Swapnil"));
		
		return "showAliens";
		
	}
	
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute Alien a)
	{
		return "result";
		
	}
}
