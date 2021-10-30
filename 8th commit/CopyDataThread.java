package com.lab8.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {

	FileReader fr;
	FileWriter fw;

	public CopyDataThread(FileReader fr, FileWriter fw) {
		this.fr = fr;
		this.fw = fw;
	}

	@Override
	public void run() {
		try {
			int cha = 0;
			while (cha != -1) {
				for (int j = 1; j <= 10; j++) {
					cha = fr.read();
					fw.write(cha);

				}
				fw.flush();
				System.out.println("10 characters copied::");
				Thread.sleep(5000);

			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
