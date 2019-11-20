package com.foo.test;

import org.junit.Test;

public class TestSingletonHungry {
	
	
	@Test
	public void testSingletonHungry() throws Exception{
		while(true){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					SingletonHungry singletonHungry = SingletonHungry.getInstance();
				}
			}).start();
		}
	}
}
