package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menuNum = 1;
		
		// ���ԵǴ� ���� ���̽����� ����
		switch(menuNum) {
		case 1:
			System.out.println("1. Simle Jave");
			break;
		case 2:
			System.out.println("2. Funny Java");
			break;
		case 3:
			System.out.println("3. Fantastic Java");
			break;
		// ���̽��鿡 �������� ������ 
		default:
			System.out.println("d. The best programming language");
		}
		System.out.println("Do you like coffee?");
	}

}
