package practice;

public class Test_0410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. int �� ���� num1, num2, num3�� ���� 10,20,30 ���� �ʱ�ȭ �Ǿ� �ִ�.
		// ���������� �����ϸ� ���� �������� ��� ���� ����ǰڴ°�?
		// num1=num2=num3 ;
		// Ȯ�� �ϴ� �ڵ带 �ۼ��ϰ�, �� ����� ���� ����.
		
		int num1 = 10, num2 = 20, num3 = 30;
		
		num1=num2=num3;	
		// ���Կ������̹Ƿ� �����ʿ��� ���� �������� ����ȴ�
		// num3�� 30�� num2�� ���� num2�� 30�� num1�� ����
		
		System.out.println(num1); // ���: 30
		System.out.println(num2); // ���: 30
		System.out.println(num3); // ���: 30
		
		// 2. ���н� {{(25x5)+(36-4)}-72}/5 �� ������� ����ϴ� ���α׷� �ۼ�.
		
		System.out.println(((25*5+(36-4))-72)/5);
		
		// 3. 3+6, 3+6+9, 3+6+9+12 �� ������ �ϴ� ���α׷� �ۼ�. ��. ���� ������ Ƚ�� �ּ�ȭ
		
		int num4 = 3+6;
		int num5 = num4 + 9;
		int num6 = num5 + 12;
		
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		// 4. a= {{(25+5)+(36/4)}-72}*5, b= {{(25x5)+(36-4)}-71}/4, c=(128/4)*2 �� ��
		//a>b>c �� ���̸� true �ƴϸ� false�� ����ϴ� ���α׷� �ۼ�
		
		int a = ((25+5+36/4)-72)*5;	// a = -165
		float b = (float)((25*5+36-4)-71)/4;	// b = 21.5
		int c = (128/4)*2;	// c = 64

		if ((a>b) && (b>c)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
