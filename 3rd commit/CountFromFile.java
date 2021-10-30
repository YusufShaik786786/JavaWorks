package com.exercise3.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountFromFile {
public static void main(String[] args) {
		
		try
		{
			int lines=0,chars=0,words=0;
			int code=0;
			//creation of stream
			FileInputStream fis = new FileInputStream("C:\\Java Basics Yusuf Shaik\\MyWorks\\src\\com\\exercise3\\java\\Sample");
			//logic to read
			while(fis.available()!=0)
			{
				code = fis.read();
				if(code!=10)
				chars++;
				if(code==32)
				words++;
				if(code==13)
				{
					lines++;
					words++;
				}
			}
			System.out.println("No.of characters = "+chars);
			System.out.println("No.of words = "+(words+1));
			System.out.println("No.of lines = "+(lines+1));
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
		catch(IOException i)
		{
			System.out.println("Cannot read file...");
		}

	}

}
