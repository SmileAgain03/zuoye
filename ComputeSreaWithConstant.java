package ex1;

//将Π声明为常量，求圆的面积

import java.util.Scanner;

public class ComputeSreaWithConstant {
	public static void main(String[] args) {
		final double PI=3.14159;
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter a number for radius:");
		double radius=input.nextDouble();
		
		double area=radius *radius *PI;
		
		System.out.println("THE area for the circle of radius" +" "+ radius +" "+ "is" +" "+area);
		
	}

}
