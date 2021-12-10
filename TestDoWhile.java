package ex5;
//读取和计算个数不确定的整数之和

import java.util.Scanner;

public class TestDoWhile {
	public static void main(String[] args) {
		int data;
		int sum =0;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter an integer (the input ends if it is 0) :");
			data = input.nextInt();
			sum += data;
			
		}while(data !=0);
			
		System.out.println("Te sum is" + sum);
			
		}
		
	}

