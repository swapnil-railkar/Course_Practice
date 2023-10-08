package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
// @Data annotation is used to implement setter and getter methods automatically for all properties.
@Component
public class Pet {
     String name;
     
}
