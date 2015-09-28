package entities;

import java.util.ArrayList;
import java.util.List;

public class Wrapping {
	
	
	
	public static List<String> splitEqually(String text, int size) {
	    List<String> ret = new ArrayList<String>();
	    
	    if (text.length() <= size) {
	    	ret.add(text);
		}
	    else {
	    	int times = text.length() / size;
	    	int begin = 0;
	    	int end = size;
	    	for (int i = 0; i < times+1 ; i++) {
	    		if (i == times) {
	    			String t = text.substring(begin , text.length());
		    		ret.add(t);
				} else
				{
	    		String t = text.substring(begin , end);
	    		ret.add(t);
	    		begin = end;
	    		end = end+size;
				}
			}
	    }
	    System.out.println( ret);
	    return ret;
	}
}
