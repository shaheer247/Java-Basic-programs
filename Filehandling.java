package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Filehandling {

	public static void main(String[] args) {
		String path="C:\\Users\\91939\\Desktop\\FILE\\Shaheer.txt";
	   File file=new File(path);
		
		//File Methods
		
	    System.out.println(file.exists());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.exists());
		System.out.println(file.getName());
		try {
		file.createNewFile();
	     }
		catch(Exception e) {
			//e.printStackTrace();
		}
		String[]File=file.list();
		for(String a:File) {
			System.out.println(a);
		}
		//file.delete();
		
		//FILE WRITING OPERATION
		/*try {
			FileWriter fw=new FileWriter(path);
			fw.write("JAVA IS FUN");
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(file.length());*/
		
		//FILE READING OPERATION
		/*try {
			String path="C:\\Users\\91939\\Desktop\\FILE\\Shaheer.txt";
			File file=new File(path);
			Scanner reader=new Scanner(file);
			while(reader.hasNextLine()) {
				String data=reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
	}
}

