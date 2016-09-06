package chapter01;

public class Gugudan01 {
	public static void main(String[] args) {

		int i = 2;

		while( i <= 9 ) {
			int j = 1;
			while( j <= 9 ) {
				int temp = i * j;
				System.out.println(i + "*" + j + "=" + temp);
				j++;
			}
			
			i = i + 1;
		}

	}

}
