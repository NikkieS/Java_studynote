package chapter4;

public class SwitchBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menuNum = 4;
		
		// ���ԵǴ� ���� ���̽����� ����
		switch(menuNum) {
		case 1:
			System.out.println("1. Simle Jave");
		case 2:
			System.out.println("2. Funny Java");
		case 3:
			System.out.println("3. Fantastic Java");
		// ���̽��鿡 �������� ������ 
		default:
			System.out.println("d. The best programming language");
		}
		System.out.println("Do you like coffee?");
	}

}
