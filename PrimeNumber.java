package ex5;
//??ʾ????
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES =50;
		final int NUMBER_OF_PRIMES_per_line =10;
		int count = 0;
		int number = 2;
		
		System.out.println("The first 50 prime numbers are \n");
		
		while(count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			
			for(int divisor = 2; divisor <= number /2 ;divisor++) {
				if(number %divisor ==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
				if(count % NUMBER_OF_PRIMES_per_line == 0) {
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
			number++;
		}
		
	}
}
