package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MainDrive {
	
	public static void main(String[] args) {
		
		File file = new File("phonebook.csv");
		
		try {
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			
			int count = 1;
			
			while(true) {
				
				String line = br.readLine();
				
				
				if(line == null)
					break;
				
				String[] splitLine = line.split(",");
				
				
				System.out.println(String.format("%d) %s : %s, %s", count, splitLine[0], splitLine[1], splitLine[2]));
				count ++;
				
			}
			
			br.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
