package ex3;
//检验一个数能否同时被2和3整除，是否被2和3整除，是否只能被2或3两者中的一者整除

import java.util.Scanner;
public class TestBooleanOperators {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter an integer :");
		int number = input.nextInt();
		
		if(number %2 ==0 && number %3 ==0)
			System.out.println(number + "is divisible by 2 an 3.");
		
		if(number %2 ==0 || number %3 ==0)
			System.out.println(number + "is divisible by 2 or 3.");
		
		if(number %2 ==0 ^ number %3 ==0)
			System.out.println(number + "is divisible by 2 or 3,but not both.");
		
	}
}
