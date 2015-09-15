package com.mycompany.app;

import java.util.Scanner;

public class App {
	
	
		
		public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please write your name. \n");
			
			String name = scan.next();
			
			System.out.println("Hello Mr/Mrs "+ name);
			
			
		
	}

}
