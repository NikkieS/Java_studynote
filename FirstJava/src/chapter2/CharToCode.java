package chapter2;

public class CharToCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A'; // char ch = '\u0041' �� �ٲ� �ᵵ ����
		int code = ch;
		
		System.out.println("���ڿ� ��� : " + ch);
		System.out.println("���ڿ� A�� �����ڵ� ��� : " + code);
		
		int code1 = 65; //int = 4byte
		char ch1 = (char)code1; //char = 2byte
		
		System.out.println(code1);
		System.out.println(ch1);
		
	}

}
