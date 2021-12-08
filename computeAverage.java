package ex1;
//键盘读取多个输入的例子，如三个，求平均值

import java.util.Scanner;

public class computeAverage {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three number:");
		
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		
		double average=(number1+number2+number3)/3;
		
		System.out.println("The averge of " + number1 + " " + number2 + " " + number3 + " " +"is" + average);
		
	}

}
