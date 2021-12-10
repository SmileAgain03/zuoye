package ex6;
//给出测试MAX的完整程序

public class TestMax {
	public static void main(String[] args) {
		int i=5;
		int j=2;
		int k=max(i,j);
		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	}
	
	public static int max(int number1,int number2) {
		int resulf;
		
		if(number1 >number2)
			resulf=number1;
		else
			resulf=number2;
		
		return resulf;
	}
}
