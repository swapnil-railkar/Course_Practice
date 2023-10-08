package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class NameController {
	
     @PostMapping("/name")
     public ModelAndView name(@RequestParam("n1") String name,HttpServletRequest request) {
    	 
    	 String message = "Hello "+ name;
    	 
    	 ModelAndView mv = new ModelAndView();
    	 mv.setViewName("welcomepage");
    	 mv.addObject("response",message);
    	 
    	 System.out.println(message);
    	 return mv;
     }
}
