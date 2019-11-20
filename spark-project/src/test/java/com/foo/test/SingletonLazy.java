package com.foo.test;

public class SingletonLazy {

	private static SingletonLazy instance;

	private SingletonLazy() {
		System.out.println("实例化了一个新的单例");
	}
	
	
	public static SingletonLazy getInstance(){
		
		if(instance != null) return  instance;
		synchronized (SingletonLazy.class) {
			if(instance == null) instance = new SingletonLazy();
			return instance;
		}
	}

}
