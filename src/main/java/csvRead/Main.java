package csvRead;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Read rd = new Read();
		
		ArrayList<String[]> lines1 = new ArrayList<>();
		lines1=rd.read();
		
		System.out.println("Enter the query below: ");
		
         QueryRead qr = new QueryRead();
         String[] lol = qr.columns();
         
         int i=0;
 		int count = 0;
 		int[] arr = new int[lol.length];
 		for(String s:lines1.get(0))
 			System.out.println(s);
 		for(String j:lol)
 			System.out.println(j);
 		for(String s:lines1.get(0)) {
 			for(String j:lol) {
 				if(s == j) {
 					arr[count]=i;
 					count++;
 				}
 				i++;
 			}
 		}
 		for(int s:arr)
 			System.out.println(s);
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
