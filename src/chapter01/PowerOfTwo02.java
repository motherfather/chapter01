package chapter01;
import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int result = 1;
		System.out.print("승수: ");

		int pow = scanner.nextInt();
		// Q: 아래 for 반복문을 작성하시오.
//		int i = 0;
//		while(i < pow){
//			result *= 2;	// result = result * 2; 
//			i++;
//		}
		for(int i = 0; i < pow; i++){
			result *=2;
		}
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
	
		scanner.close();
	}

}



