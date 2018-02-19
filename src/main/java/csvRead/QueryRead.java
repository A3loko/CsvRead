package csvRead;

import java.util.Scanner;

public class QueryRead {
	
	
	
	//Taking the query as input
    Scanner scanner = new Scanner(System.in);
    String query = scanner.nextLine();
	
    //Tokenizing the input query
    public String[] token() {
    	String[] tok=query.split(" "); 
    	return tok;
    }
    
    //Extracting the file name
    public String FileName() {
    	String a[] = query.split("from ");
    	System.out.println(a[1]);
    	return a[1];
    }
    
    
    
	public String[] columns() {
		
      //Getting the columns to be retrieved
        String a[]= query.split("select ");
        String b[]= a[1].split(" from");
        String c[]=b[0].split(",");
        /*for(String s:c)
        System.out.println(s);*/
        return c;
	}
}
	
	
