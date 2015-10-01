package words;
import java.util.ArrayList;

import java.util.List;

public class WordWrapping {
	private ArrayList<String> list;
			
		
		
		public List<String> algorithm3(String input, int length) {
			list = new ArrayList<String>();
			String row = null ;
			char empty=' ';
			int endIndex=0;	
			int beginIndex=0;  
				if (input.length() > length){
					endIndex=length;
					while (input.length() > length) {
						if (input.length() > length && (input.charAt(beginIndex)!=empty)) {
							row=(String) input.subSequence(beginIndex, endIndex);
							input=(String) input.subSequence(endIndex, input.length());
						}else if (input.length() > length && (input.charAt(beginIndex)==empty) ) {
							row=(String) input.subSequence(beginIndex+1, endIndex+1);
							input=(String) input.subSequence(endIndex+1, input.length());

						}
						list.add(row);
					}
					list.add(input);
			}
						
			return list;
			
		}

}
