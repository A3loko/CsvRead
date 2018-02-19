package csvRead;
import java.util.ArrayList;

import csvRead.QueryRead;
import csvRead.Read;

public class Match {
	public void match(){
		QueryRead fromQuery = new QueryRead();
		
		String[] toBe = fromQuery.columns();
		
		for(String s:toBe)
			System.out.println(s);
		
		Read fromFile = new Read();
		
		ArrayList<String[]> notToBe = fromFile.read();
		
	}
}
