package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		byte b = 20;
		short s = 100;
		int i = 10;
		long l = 90;
		float f = 3.14f;
		double d = 3.14;
		boolean bool = true;
		char c = 'A';
		
		String str = "Hello World"; // String�� ��ü��!
									
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(c);
		System.out.println(str);
		
		// reference type(������)
		Circle circle = new Circle();
		circle.radius = 5;
		circle.area = 5 * 5 * 3.14;
		System.out.println(circle.area);
		
		String str1 = new String("Hello World"); // String�� ���� �̷� ����
		System.out.println(str1);
		
		String str2 = "Hello World"; // String�� ���� ���̹Ƿ� *�ڵ����� ���� �������� �ٲ�
		System.out.println(str2);
		
		// character��
		char ch1 = '1';
		char ch2 = 49;
		char ch3 = 1;
				
		System.out.println(ch1 + ":" + ch2 + ":" + ch3);
	}

}
