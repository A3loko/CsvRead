package csvRead;

public class QueryRead {
	    
    //Tokenizing the input query
    public String[] token(String q) {
    	String[] tok=q.split(" "); 
    	
    	for(String s:tok)
    		System.out.println(s);
    	return tok;
    }
    
    //Extracting the file name
    public String fileName(String q) {
    	String a[] = q.split("from");
    	String b[]=a[1].split("where");
    	return b[0];
    }
    
    
    
	public String[] columns(String q) {
		
      //Getting the columns to be retrieved
        String a[]= q.split("select ");
        String b[]= a[1].split(" from");
        String c[]=b[0].split(",");
        return c;
	}
	
	public String[] condition(String q){
		String a[] = q.split("where ");
		return a;
	}
	
	public String same(String q) {
		return q;
	}
	
}
	
	
