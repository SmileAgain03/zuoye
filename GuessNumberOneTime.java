package ex5;

//²ÂÊý×Ö

import java.util.Scanner;
public class GuessNumberOneTime {
	public static void main(String[] args) {
		
		int number = (int)(Math.random()*101);
		
		Scanner input =new Scanner(System.in);
		System.out.print("Guess a magic number between 0 and 100");
		
		System.out.print("\nEnter your guess :");
		int guess = input.nextInt();
		
		if(guess == number)
			System.out.println("YES.the number is " + number);
		else if (guess > number)
			System.out.println("Your guess is too high");
		else
			System.out.println("Your gurss is too low");
		
	}
}
