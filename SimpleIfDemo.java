package ex3;
//输入一个整数，如果该数字是5的倍数打印HiFive,如果该数字能被2整除，打印HiEven

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer :");
		int number=input.nextInt();
		
		if(number % 5 ==0) 
			System.out.println("HiFive");
		if(number % 2 ==0)
			System.out.println("HiEven");
		
	}
}
