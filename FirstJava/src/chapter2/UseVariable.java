package chapter2;

public class UseVariable {

	public static void main(String[] args) {
		// 1. ������ Ÿ���� ���� num1������ ��������
		// 2. ���� num1�� ���� ������ 10�� ��������.
		// 3. ������ Ÿ���� ���� num2������ �����ϰ�
		// ���� 20�� ��������.
		// 4. ������ Ÿ���� ���� num3�� �����ϰ�
		// ���� num1�� num2�� ���ϴ� ������ �����

		// ���� num3�� �����Ѵ�.
		// 5. ������ ����� �������.

		int num1;
		num1 = 10;	// ���� ���� ��, ó�� �����͸� �����ϴ°� -> �ʱ�ȭ

		int num2 = 20; // ���� ����� �ʱ�ȭ�� �ѹ��� ����

		int num3;
		num3 = num1 + num2;
		// int num3 = num1 + num2;

		System.out.println(num1 + "+" + num2 + "=" + num3);

	}

}
