package csvRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {
	
	//Reading the CSV file
	public ArrayList<String[]> read(){
		BufferedReader br = null;
	    ArrayList<String[]> lines = new ArrayList<>();
	    try {
	    br=new BufferedReader(new FileReader("/home/sapient/Desktop/javaProject/CsvRead/ipl.csv"));
	    String line = null;
        String[] arr;
        
        //Splitting each row at ","
        while ((line = br.readLine()) != null) {
            arr=line.split(",");
            lines.add(arr);
            }
    }
    
    catch(Exception e){
        System.out.println(e);
    }
	    finally {
	    	try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	   
	return lines;
}
}