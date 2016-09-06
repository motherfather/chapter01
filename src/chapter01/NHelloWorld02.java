package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		System.out.print("횟수 입력 > ");
		int count= scanner.nextInt();

		// Q: 아래 for문을 사용하여 “Hello World”를 입력 받은 수 만큼 출력 하세요.
		
		for(int i = 1; i <= count; i++){
			int j = 0;
			while(i > j){
				for(int a = 0; a <= count; a++){
					System.out.print("           " + '\t');
				}
			System.out.print("Hello World" + '\t');
			j++;
			}
			System.out.println();
		}
		scanner.close();
	}

}
