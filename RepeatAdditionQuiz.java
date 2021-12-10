package ex5;
//提示用户为两个个位数相加的问题给出答案
import java.util.Scanner;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		int number1=(int)(Math.random() *10);
		int number2=(int)(Math.random()*10);
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is "+number1 + "+"+ number2 + "?");
		int answer = input.nextInt();
		
		while(number1 +number2 !=answer) {
			System.out.print("Wrong answer. Try again. what is" + number1 + "+" + number2 + "?");
			answer=input.nextInt();
		}
		System.out.println("You got it!");
	}
}
