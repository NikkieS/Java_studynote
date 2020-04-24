package projectVer4;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		PhoneInforManager manager = new PhoneInforManager();
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			Menu.showType();
			int selectType = sc.nextInt();
			sc.nextLine();
			
			switch(selectType) {
			case 1:
				System.out.println("University contacts.");
				break;
			case 2:
				System.out.println("Company contacts.");
				break;
			case 3:
				System.out.println("Regular contacts.");
				break;
			}
			
			Menu.showMenu();
			
			int selectMenu = sc.nextInt();
			sc.nextLine();
			
			switch(selectMenu) {
			case 1:
				System.out.println("");
				manager.addInfo(selectType);
				break;
			case 2:
				System.out.println("");
				manager.searchInfo();
				break;
			case 3:
				System.out.println("");
				manager.deleteInfo();
				break;
			case 4:
				System.out.println("");
				manager.showAllData();
				break;
			case 5:
				System.out.println("");
				manager.showData(selectType);
				break;
			case 6:
				System.out.println("");
				System.out.println("Quit");
				System.exit(0);
				break;
			}

		}

	}
}
