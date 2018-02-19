package csvRead;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Read rd = new Read();
		
		ArrayList<String[]> lines1 = new ArrayList<>();
		lines1=rd.read();
		
        
		System.out.println("Enter the query below: ");
		
       // QueryRead qr = new QueryRead();
        
       // String[] query = qr.columns();
        
        DataType dt = new DataType();
        
        ArrayList<String> type = new ArrayList<>();
        type=dt.datatype();
        
        Match match = new Match();
         //int[] pop = match.match();
         
        /* for(int i:pop) {
        	 System.out.println(i);
         }*/
        
	}

}
