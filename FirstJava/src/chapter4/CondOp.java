package chapter4;

public class CondOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 50, num2 = 100;
		int big, diff;
		
		// ū�� ���ϱ�
		big = (num1 > num2)? num1:num2;
		
		//�� ���� ����
		diff = (num1 > num2)? num1-num2:num2-num1;
		
		System.out.println(diff);
	
	}

}
