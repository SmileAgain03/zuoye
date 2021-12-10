package ex5;
//读取和计算个数不确定的整数之和

import java.util.Scanner;
public class SentinelValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (the input ends if it is 0) :");
		int data = input.nextInt();
		
		int sum =0;
		while(data !=0) {
			sum += data;
			System.out.print("Enter an intrger (the input ends if it is 0) :");
			data = input.nextInt();
		}
		System.out.println("Te sum is" + sum);
	}
}
