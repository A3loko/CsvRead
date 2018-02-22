package csvRead;
import java.util.ArrayList;

import csvRead.Match;
import csvRead.QueryRead;
import csvRead.Read;

public class Print {
	public void print() {
		
		//Taking whole data as input
		Read rd = new Read();
		ArrayList<String[]> lines1 = new ArrayList<>();
		lines1=rd.read();
		
		//Taking in the query to be executed
		QueryRead qr = new QueryRead();
        String[] col = qr.columns();
        String[] cond = qr.condition();
        
        ArrayList<Integer> index= new ArrayList<>(); 
        Match find = new Match();
        index = find.match();
        
        String query = qr.same();
        if(! query.contains("where")) {
        	if(col[0].equals("*")) {
        		for(String[] s : lines1) {
        			System.out.println("");
        			for(String j: s) {
        				System.out.print(j + "\t");
        			}
        		}
        	}
        	
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
