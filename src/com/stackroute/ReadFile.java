package com.stackroute;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("/home/vaishnavi/Desktop/File.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);			
			String st = bufferedReader.readLine();
			
			while(st!=null){
				System.out.println(st.toUpperCase());
				st = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
