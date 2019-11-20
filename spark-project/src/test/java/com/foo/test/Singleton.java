package com.foo.test;

public class Singleton {

	private static Singleton instance;

	public Singleton() {
		System.out.println("实例化了一个新的单例");
	}
	
	public static Singleton getInstance(){
		
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}
	
}
