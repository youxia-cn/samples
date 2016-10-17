package com.xkland.sample;

public class Speaker {
	
	private String name;

	public Speaker(String name){
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hello World! My name is " + name);
	}
}
