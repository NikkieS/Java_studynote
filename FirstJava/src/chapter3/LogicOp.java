package chapter3;

public class LogicOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10, num2 = 20;
		// int num1 = 10;
		// int num2 = 20;
		
		// num1�� num2���� ū�� Ȯ��
		// ū ��� -> true, ���� ��� -> false
		boolean check1 = num1 > num2;
		
		if (check1) {
			System.out.println("num1�� ���� num2�� ������ Ů�ϴ�.");
		}
		else {
			System.out.println("num1�� ���� num2�� ������ �۽��ϴ�.");
		}
		
		boolean result1 = num1 == 10 && num2 == 20;
		boolean result2 = num1 <= 12 || num2 >= 30;
		
		System.out.println("num1==10 �׸��� num2==20: " + result1);
		System.out.println("num1<=12 �Ǵ� num2 >=30: " + result2);
		
		if ((num1!=num2))
			System.out.println("num1�� num2�� ���� �ʴ�.");
		else
			System.out.println("num1�� num2�� ����.");
		
		System.out.println("-------------------------");
		
		int age = 20;
		char gender = 'w';
		boolean mCheck = true;
		
		boolean result = age > 19 && gender == 'w' && mCheck;
		
		if (result) {
			System.out.println("�޽����� �����ϴ�.");
		}
	}

}
