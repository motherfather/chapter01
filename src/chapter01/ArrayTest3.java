package chapter01;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int arrayInt2[];	// 비추천방법
//		int[10] arrayInt3;	// 오류
		
		int[] arrayInt1;	// *추천방법
		arrayInt1 = new int[10];
		arrayInt1[0] = 1;
		arrayInt1[1] = 2;
		arrayInt1[2] = 3;
		arrayInt1[3] = 4;
		arrayInt1[4] = 5;
		
		// 추천
		int[] arrayInt4 = {1, 2, 3, 4, 5};

//		Book[] books = {new Book(), new Book()};
		
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May"};
		
		// 비추천
		int[] arrayInt5 = new int [] {10, 20, 30, 40, 50};
		
//		error
//		int[] arrayInt6;
//		arrayInt6 = {10, 20, 30, 40};

	}

}
