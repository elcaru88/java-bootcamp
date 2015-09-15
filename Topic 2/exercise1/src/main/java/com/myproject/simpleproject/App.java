package com.myproject.simpleproject;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
		
		 Scanner scanner = new Scanner(System.in);
    	System.out.println("Insert name");
    	String name = scanner.nextLine();
        System.out.println( "Hello " + name );
        scanner.close();
	}
}
