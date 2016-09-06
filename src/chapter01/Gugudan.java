package chapter01;

public class Gugudan {

	public static void main(String[] args) {
		int j = 1;
		while( j <= 9 ) {
			int i = 1;
			while( i <= 9 ) {
				int temp = i * j;
				System.out.print(i + "*" + j + "=" + temp + '\t');
				i++;
			}
			System.out.println();
			j++;
		}

	}
}