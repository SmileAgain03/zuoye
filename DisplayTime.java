package ex1;

//����Ϊ��λ��ʱ�����������ķ����������µ���������500�����8����20��

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
