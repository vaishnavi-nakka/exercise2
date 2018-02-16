package main.java.com.stackroute;


import java.io.*;
import java.util.HashMap;

public class WordCounter {
	
	
			
	public HashMap<String, Integer> countWords(String fileName) {		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		String line;
		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(reader);			
			line = bufferedReader.readLine();
			if(line == null) {
				bufferedReader.close();
				return null;
			}
			int x = 1;
			
			while(line != null) {
				String[] words = line.split(" ");
				for(int i = 0; i < words.length; i++) {
					if(wordCount.containsKey(words[i])) {
						int freq = wordCount.get(words[i]);
						freq += 1;
						wordCount.put(words[i], freq);
					}
					else {
						wordCount.put(words[i], x);
					}
				}
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return wordCount;
	}	
}