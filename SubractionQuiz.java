package ex3;
//生成两个随机一位整数，进行减法程序，最后确定是否正确
import java.util.Scanner;

public class SubractionQuiz {
	public static void main(String[] args) {
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		
		if(number1 < number2) {
			int temp = number1;
			number1=number2;
			number2=temp;
		}
		
		System.out.print("What is" +" "+ number1 +"-" + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(number1 - number2 == answer)
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + "-" + number2 + "should be" + (number1 - number2));
		
	}
}
