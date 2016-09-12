package chapter01;

public class ArrayTest {

	public static void main(String[] args) {
		int[] scores = new int[5];
		
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		
//		error
//		scores[5] = 60;
		
		int sum = 0;	// 지역변수라서 초기화 해줘야 함 
		int size = scores.length;
		System.out.println("size:" + size);
		for(int i = 0; i < scores.length; i++){
			sum = sum + scores[i];
		}
		
		System.out.println(sum);
	}

}
