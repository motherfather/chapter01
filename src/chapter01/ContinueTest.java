package chapter01;

public class ContinueTest {

	public static void main(String[] args) {
//		for(int i = 0; i <= 20; i++){
//			if(i % 2 != 0 && i % 3 != 0){
//				System.out.println(i);
//			}
//		}
// 위는 복잡하기 때문에 아래처럼 하면 보기도 쉽고~
		for(int i = 0; i <= 20; i++){
			if(i % 2 == 0){
				continue;
			}
			if(i % 3 == 0){
				continue;
			}
			System.out.println(i);
		}
	}

}
