package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Autowired
	private Pet pet;

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Bhow bhow");
		pet.setName("I'm dog");
		System.out.println(pet.getName());
	}

}
