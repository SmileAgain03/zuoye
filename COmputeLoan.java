package ex1;

//用户输入年利率，年数以及贷款额度（）

import java.util.Scanner;

public class COmputeLoan {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter annual interest rate, for example ,7.25:");
		double annualInterestRate=input.nextDouble();
		double monthlyInterestRate=annualInterestRate/1200;
		
		System.out.print("Enter number of years as an integer, for example ,5:");
		int nomber0fYears=input.nextInt();
		  
		System.out.print("Enter loan amount, for example , 120000.95:");
		double loanAmount =input.nextDouble();
		
		double monthlyPayment=loanAmount * monthlyInterestRate /(1- 1/Math.pow(1+monthlyInterestRate, nomber0fYears *12));
		double totalPayment=monthlyPayment * nomber0fYears *12;
		
		System.out.println("The monthly payment is $" + (int)(monthlyPayment *100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment *100) / 100.0);
		
		
		
	}

}
