package br.com.tectoid.im.client.model;

import java.io.Serializable;

public class Contact implements Serializable{
	private String name;
	
	public Contact(){}
	
	public Contact(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
