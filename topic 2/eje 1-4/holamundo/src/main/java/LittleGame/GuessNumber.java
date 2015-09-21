package LittleGame;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		GuessNumber gn = new GuessNumber();
		Integer gameNumber= gn.getNumber();
		System.out.println("Guess the number, from 0 to 10");
		
		Scanner in = new Scanner(System.in);
		Integer userNumber=Integer.parseInt(in.nextLine());
		if (userNumber==gameNumber) {
			System.out.println("You Win!!!!!!!");
		}else {
			System.out.println("You lose");
		}
		System.out.println("The number is: "+gameNumber);
	}
	
	public Integer getNumber() {
		Integer number=0;
		number=(int) (Math.random()*10);
		return number;
	}

}
