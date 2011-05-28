package br.com.tectoid.im.client.model;

import java.io.Serializable;

public class Message implements Serializable {
	private String message;
	
	public Message(){}
	
	public Message(String message){
		this.message = message;
	}
	
	public String toString(){
		return this.message;
	}
}
