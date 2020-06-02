package phoneBook;

import java.util.Scanner;

public class MainManager {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("-----------------------");
			System.out.println("1. 기본 연락처");
			System.out.println("2. 대학 연락처");
			System.out.println("3. 직장 연락처");
			System.out.println("4. 동회회 연락처");
			System.out.println("5. 종료");
			System.out.println("-----------------------");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				//BasicManager
				break;
			case 2 :
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				return;
			}
		}
	}
}
