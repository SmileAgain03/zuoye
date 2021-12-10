package ex5;
//输入一个十进制数，将他转换为一个字符串形式的十六进制

import java.util.Scanner;

public class Dec2Hex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number:");
		int decimal = input.nextInt();
		
		String hex = " ";
		
		while(decimal !=0) {
			int hexValue = decimal % 16;
			
			char hexDigit = (0 <= hexValue && hexValue <= 9)?
				(char)(hexValue + '0'):(char)(hexValue - 10 + "A");
			hex = hexDigit + hex;
			decimal = decimal / 16;
		}
		System.out.println("The hex number is " + hex);
	}
}
