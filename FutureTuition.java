package ex5;
//����ĳ����ѧ����ķ�����10000��Ԫ��������ÿ��7%���ٶ����ӡ��������Ժ�ѧ�ѻᷭ��
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
