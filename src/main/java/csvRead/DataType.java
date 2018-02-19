package csvRead;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class DataType {
	public ArrayList<String> datatype() {
		//Determining the data type of each column.
		 ArrayList<String[]> lines1 = new ArrayList<String[]>();
		 Read rd = new Read();
		 
		 lines1=rd.read();
        String[] columns = lines1.get(1);
        Pattern number = Pattern.compile("[0-9]+");
        Pattern date = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
        Matcher m;
               
        ArrayList<String> datatype = new ArrayList<String>();
        for(String s : columns) {
            m = date.matcher(s);
            if(m.find()) {
                datatype.add("Date");
            }
            else {
                m = number.matcher(s);
                if(m.find())
                    datatype.add("Integer");
                else
                    datatype.add("String");
            }
        }
        return datatype;
	}
}
