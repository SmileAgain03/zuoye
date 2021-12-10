package ex5;
//计算从0.01到1.0的数列之和，该数列中的数值以0.01递增

public class TestSum {
	public static void main(String[] args) {
		float sum =0;
		
		for(float i=0.01f; i<=1.0f;i=i+0.01f)
			sum +=i;
		
		System.out.println("The sum is" + sum);
	}
}
