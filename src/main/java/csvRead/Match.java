package csvRead;
import java.util.ArrayList;

import csvRead.QueryRead;
import csvRead.Read;

public class Match {
	public int[] match(){
		QueryRead fromQuery = new QueryRead();
		
		String[] toBe = fromQuery.columns();
		
		Read fromFile = new Read();
		
		ArrayList<String[]> notToBe = fromFile.read();
		int i=0;
		int count = 0;
		int[] arr = new int[toBe.length];
		for(String s:notToBe.get(0)) {
			for(String j:toBe) {
				if(s != j) {
					System.out.println("sjkdbv");
					arr[count]=i;
					count++;
					i++;
					break;
				}
			}
		}
		for(int s:arr)
			System.out.println(s);
		return arr;
	}
}
