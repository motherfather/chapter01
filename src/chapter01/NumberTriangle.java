package chapter01;

public class NumberTriangle {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("java NumberTriangle [N] : N=숫자");
			return;
		}
		
		int count = Integer.parseInt(args[0]);
//		System.out.println(count);
		
		for(int i = 1; i <= count; i++){
//			System.out.println(i);
			for(int j = 0; j < i; j++){
				System.out.print(i);
			}
			System.out.print("\n");
		}

	}

}
