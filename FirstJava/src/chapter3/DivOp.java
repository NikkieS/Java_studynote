package chapter3;

public class DivOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = 3;
		
		// ������ ������ ����
		System.out.println("������ ������: " + num1/num2);
		
		// �Ǽ��� ������ ����
		System.out.println("�Ǽ��� ������: " + 7f/3f); // ���ͷ��θ� �����ϴ�
		System.out.println("�Ǽ��� ������: " + (float)num1/num2);	//num2�� num1�� ����� floatȭ ���ش�		
		
	}

}
