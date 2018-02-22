package csvRead;
import java.util.ArrayList;

import csvRead.QueryRead;
import csvRead.Read;

public class Match {
	public ArrayList<Integer> match(){
		QueryRead fromQuery = new QueryRead();
		String[] col = fromQuery.columns();
		
		ArrayList<Integer> count = new ArrayList<>();
		Read fromData = new Read();
		ArrayList<String[]> all = fromData.read();
		for(String s:col) {
			int i=0;
			for(String j:all.get(0)) {
				if(s.equals(j)) {
					count.add(i);
				}
				i++;
			}
		}
		return count;
	}
}
