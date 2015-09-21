package exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordWrapping {

	private List<String> list;

 public String borrar (String first, String second){
	if (second.contains(first.subSequence(0, first.length())))
			{
				second = second.substring(first.length());
			}
		return second;
	}
	
	
	public List<String> algorithm(String input, int length) {
		list = new ArrayList<String>();
		
		String first = null ;
			
		if (input.length() > length){
		first = input.substring(0, length);
			
		algorithm(borrar(first,input), length);
		
		list.add(first);

		}
		else list.add(input);
	
		Collections.reverse(list);
		return list;
		
	}
	
}
