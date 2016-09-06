package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = scanner.nextInt();
		boolean isPrime = true;
		
		while(divisor < num){
			int result = num % divisor;
			if(result == 0){
				//소수가 아님
				isPrime = false;
				System.out.println("detect!");
				break;
			
			}
			divisor++;
		}
		if(!isPrime)
			System.out.println(num + "은 소수 X");
		else
			System.out.println(num + "은 소수 O");

	}
}

