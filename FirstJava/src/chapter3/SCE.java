package chapter3;

public class SCE { // SCE : Short Circuit Evaluation
	public static void main (String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
		result = (num1 += 10)<0 && (num2+=10)>0;	//num1 < 0���� false������ ���� �񱳿����� ���� ����
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		result = (num1+=10)>0 || (num2+=10)>0;	// num1 > 0�� true������ ���� �񱳿����� ���� ����
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		// ���� �������� Ư¡ : �ǿ����� �� ǥ�������� ū Ÿ������ ����ȯ �Ѵ�.
		byte a = 10;
		byte b = 20;
		
		byte c = (byte)(a+b);
	}
}
