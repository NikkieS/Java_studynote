package chapter3;

public class ArithOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		
		num1 = 10;
		num2 = 20;
		
		// 2. ���� ���� -> ����� �������
		int result = num1 + num2;
		System.out.println("���� ���: " + result);
		
		// 3. ���� ���� -> ����� �������
		result = num2 - num1;
		System.out.println("���� ���: " + result);
		
		// 4. ���� ���� -> ����� �������
		result = num1 * num2;
		System.out.println("���� ���: " + result);
		
		// 5. ������ ���� -> ����� �������
		result = num2 / num1;
		System.out.println("������ ���: " + result);
		
		// 6. ������ ���� -> ����� �������
		result = num1 % num2;
		System.out.println("������ ���: " + result);
		
	}

}
