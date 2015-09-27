package exercise2;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		WordWrapping ww = new WordWrapping();
		String hola = "hola";
		
		//System.out.println(Arrays.toString(hola.split(hola)));
		//System.out.println("hola como estas".substring(0, 2));
		
		System.out.println(ww.algorithm("excelente", 5));
		
	}

}
