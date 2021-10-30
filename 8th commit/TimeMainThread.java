package com.lab8.java;

public class TimeMainThread {

	public static void main(String[] args) throws InterruptedException {

		RefreshTime time=new RefreshTime();
		
		Thread t=new Thread(time);
			t.start();
		
	}

}
