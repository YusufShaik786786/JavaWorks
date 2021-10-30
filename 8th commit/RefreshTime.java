package com.lab8.java;

import java.time.LocalTime;
import java.util.*;

public class RefreshTime implements Runnable  {

	@Override
	public void run() {
		System.out.print("Current Time Is::");
		for (int i = 0; i <10; i++) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("Time After 10 sec Is::");
			
			
		}
		
	}

}
