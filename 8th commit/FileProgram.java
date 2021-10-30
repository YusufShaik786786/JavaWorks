package com.lab8.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		File source = new File("source.txt");
		String target = "C:\\Java Basics Yusuf Shaik\\MyWorks\\Hello\\target.txt";
		try {
			fr = new FileReader(source);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			fw = new FileWriter(target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		CopyDataThread cd=new CopyDataThread(fr,fw);
		cd.start();
	}

}
