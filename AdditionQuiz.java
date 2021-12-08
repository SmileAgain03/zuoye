package ex3;
//批改答案的对错
import java.util.Scanner;
public class AdditionQuiz {
	public static void main(String[] args) {
		//生成第一个随机数
		int number1=(int)(System.currentTimeMillis()%10);
		int number2=(int)(System.currentTimeMillis()/10 %10);
		//生成第二个随机数
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is" +" "+ number1 + "+" + number2 + "?");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + "+" + number2 + "=" +answer +" "+"is" +" "+(number1 + number2 == answer));
		
		
	}
}
