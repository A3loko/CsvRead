package csvRead;
import java.util.ArrayList;

import csvRead.Match;
import csvRead.QueryRead;
import csvRead.Read;

public class Print {
	public void print(String query1) {
		//Taking whole data as input
		Read rd = new Read();
		ArrayList<String[]> lines1 = new ArrayList<>();
		lines1=rd.read();
		
		//Taking in the query to be executed
		QueryRead qr = new QueryRead();
        String[] col = qr.columns(query1);
        String[] cond = qr.condition(query1);
        
        ArrayList<Integer> index= new ArrayList<>(); 
        Match find = new Match();
        index = find.match(query1);
        //Printing the requested data
        String query = qr.same(query1);
        if(! query.contains("where")) {
        	//printing the query containing * and no where
        	if(col[0].equals("*")) {
        		for(String[] s : lines1) {
        			System.out.println("");
        			for(String j: s) {
        				System.out.print(j + "\t");
        			}
        		}
        	}
        	
        	//Printing the query containing column names and no where
        	
        	else {
        		for(String[] s : lines1) {
        			int i=0;
        			System.out.println("");
        			for(String j: s) {
        				if(index.contains(i)){
        						System.out.print(j + "\t");
        				}
        				i++;
        			}
        		}
        	}
        }
	}
}
