package words;

public class WordWrappingDemo {
public static void main(String[] args) {
		
		WordWrapping w1 = new WordWrapping();
		System.out.println(w1.algorithm3("Hello word!", 6));
		System.out.println(w1.algorithm3("a b c d e f", 3));
		System.out.println(w1.algorithm3("Excelent", 5));
		
		//System.out.println(w1.algorithm("\n Hello word!", 6));
		//System.out.println(w1.algorithm("a b c d e f", 3));
	}

}
