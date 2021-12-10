package ex6;
//定义一个printGrade的方法，然后调用它打印出给定分数的等级

public class TestVoiddMethod {
	public static void main(String[] args) {
		System.out.print("The grade is :");
		printGrade(78.5);
		
		System.out.print("The grade is :");
		printGrade(59.5);
	}
	
	public static void printGrade(double score) {
		if(score >= 90.0) {
			System.out.println("A");
		}
		if(score >= 80.0) {
			System.out.println("B");
		}
		if(score >= 70.0) {
			System.out.println("C");
		}
		if(score >= 60.0) {
			System.out.println("D");
		}
		else
			System.out.println("F");
	}
		
}
