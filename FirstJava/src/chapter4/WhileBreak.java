package chapter4;

public class WhileBreak {

	public static void main(String[] args) {
		// 1~10 ������ ���ڸ� 3�� ����� �����ϰ� ���
		
		for(int i=1; i<=10; i++) {
			if(!(i%3==0)) {
				System.out.println(i);
			}
		}
		
		// 1~10 ������ ���ڸ� 3�� ����� ���
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		// 1~10 ������ ���ڸ� 3�� ����� �����ϰ� ��� (continue)
		for(int i=1; i<=10; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
