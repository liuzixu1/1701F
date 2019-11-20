package com.foo.test;

import org.junit.Test;

/*
 * 单线程下的单例模式
 * 定义 : 确保一个类只有一个实例,并提供一个全局访问点.
 * 
 */
public class SingletonTest {

	/*
	 * 方法调用一个实例
	 */
	
	@Test
	public void testSinglon1(){
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
	}
	
	
	/*
	 * 使用多线程Runnable 进行同步线程操作,
	 */	
	@Test
	public void testSingleton2() throws Exception{
		while(true){
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Singleton singlon = Singleton.getInstance();
				}
			}).start();
		}
	}
	
	

}
