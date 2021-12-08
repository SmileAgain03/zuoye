package ex1;

//从键盘读入一个数据，将该数值赋给radius

import java.util.Scanner;

public class ComputeaAreaWithConsoleInput {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Entera number for radius:");
		double radius=input.nextDouble();
		
		double area=radius*radius*3.14159;
		
		System.out.println("The area for the circle of radius" + radius + "is" + area);
	}
	

}
