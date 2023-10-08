package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	private PersonDao dao;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/getAllPersons")
	public List<Person> getAllperson() {
		return dao.getPerson();

	}
	
	@PostMapping("add")
	public ModelAndView addPerson(@RequestParam("aid") int id, @RequestParam("aname") String name, ModelAndView m) {
		String message = "Welcome "+name +"your id is : "+ String.valueOf(id)+"";
		m.addObject("response", message);
		m.setViewName("welcomepage");
		
		return m;
	}
}
