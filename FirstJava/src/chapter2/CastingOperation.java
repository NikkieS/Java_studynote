package chapter2;

public class CastingOperation {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'z';
		
		int num1 = ch1;		//����ȯ
		int num2 = (int)ch2;	//����� ����ȯ
		
		System.out.println("���� A�� �����ڵ� ��: " + num1);
		System.out.println("���� Z�� �����ڵ� ��: " + num2);
		
		char ch3 = 'Z';
		int num3 = ch3;
		System.out.println(num3);
		
		int i = 100;
		char ch = 'A';
		
		System.out.println(true + "");
		
	}

}
