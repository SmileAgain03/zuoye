package ex1;

//以秒为单位的时间量所包含的分钟数和余下的秒数，如500秒就是8分钟20秒

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter an integer for seconds:");
		int seconds=input.nextInt();
		
		int minuts=seconds/60;
		int remainingSeconds=seconds%60;
		
		System.out.println(seconds+" "+ "seconds is" + minuts + " "+ "minutes and" + remainingSeconds+" " + "seconds");
	}

}
