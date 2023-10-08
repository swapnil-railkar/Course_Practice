package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Autowired
	private Pet pet;
	
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Meow meow");
		pet.setName("I'm cat");
        System.out.println(pet.getName());
	}

}
