package ex5;
//假设某个大学今年的费用是10000美元，而且以每年7%的速度增加。多少年以后学费会翻倍
public class FutureTuition {
	public static void main(String[] args) {
		double tuition = 10000;
		int year = 0;
		while(tuition < 20000) {
			tuition = tuition * 1.07;
			year++;
		}
		
		System.out.println("Tuition will be doubles in" + year + "year");
		System.out.printf("Tuition will be $%0.2f in %ld years",tuition,year);
		
	}
}
