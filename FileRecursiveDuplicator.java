package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRecursiveDuplicator {
	 public static void main(String[] args) {

	       

	       String filePath = "C:\\Users\\kbonilla2\\eclipse-workspace\\Final Review\\src\\FileIO\\example.txt";


	       try {

	           List<String> fileContents = readFile(filePath);

	           for (String line : fileContents) {

	               System.out.println(duplicateLine(line, 2));

	           }

	       } catch (IOException e) {

	           System.out.println("Error reading file: " + e.getMessage());

	       }

	   }


	   public static List<String> readFile(String filePath) throws IOException {

	        BufferedReader br = new BufferedReader(new FileReader(filePath));
	        List<String> list = new ArrayList<>();
	        
	        String line;
	        
	        while((line = br.readLine()) != null) {
	        	list.add(line);
	        }
	        br.close();
	        
	        return list;



	   }


	   public static String duplicateLine(String line, int times) {
		   if(times == 1) {
			   return line;
		   }
		   else {
			   return line + " " +duplicateLine(line, times - 1);
		   }
	       



	   }

}
