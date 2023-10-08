package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
     
	@Id
	@Column(name = "aid")
	private int aid;
	
	@Column(name = "aname")
	private String aname;
	
	public Alien() {};
	
	public Alien(int id, String name) {
		super();
		this.aid = id;
		this.aname = name;
	}
	
	public int getId() {
		return aid;
	}
	public void setId(int id) {
		this.aid = id;
	}
	public String getName() {
		return aname;
	}
	public void setName(String name) {
		this.aname = name;
	}
}
