package chapter2;

public class CastingOperation {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'z';
		
		int num1 = ch1;		//형변환
		int num2 = (int)ch2;	//명시적 형변환
		
		System.out.println("문자 A의 유니코드 값: " + num1);
		System.out.println("문자 Z의 유니코드 값: " + num2);
		
		char ch3 = 'Z';
		int num3 = ch3;
		System.out.println(num3);
		
		int i = 100;
		char ch = 'A';
		
		System.out.println(true + "");
		
	}

}
