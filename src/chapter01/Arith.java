package chapter01;

public class Arith {

	public static void main(String[] args) {

		int a = 7;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(-a);

		a = a + 1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		System.out.println(a++);	// System.out.println(a); 을 하고
									// a++; 을 한값
		
		System.out.println(++a);	// ++a; 을 하고	
									// System.out.println(a); 을 한값
		System.out.println(--b);
		System.out.println(b--);
		
		// 나누기 연산
		System.out.println(10 / 3);
		System.out.println(10. / 3.);
		System.out.println(10. / 3);
		
		System.out.println((double)10 / 3);		// 실수/정수를 나눈 값
		System.out.println((double)(10 / 3));	// 정수/정수를 한 값을 더블로 캐스팅한것
		
		// 나머지 연산
		System.out.println(44 % 3);
		System.out.println(-7 % 3);
		System.out.println(7 % -3);
	
	}

}
