package com.foo.test;

import org.junit.Test;

public class SingletonLazyTest {

	@Test
	public void testSingletonLazy() throws Exception{
		while(true){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					SingletonLazy instance = SingletonLazy.getInstance();
				}
			}).start();
		}
	}
}
