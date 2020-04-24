package projectVer4;

public class PhoneMain {

	public static void main(String[] args) {
		PhoneInforManager manager = new PhoneInforManager();		
		
		while(true) {
			
			Menu.showMenu();
			
			int selectMenu = manager.sc.nextInt();
			manager.sc.nextLine();
			
			switch(selectMenu) {
			case 1:
				System.out.println("");
				Menu.showType();
				int selectType = manager.sc.nextInt();
				manager.sc.nextLine();
				
				switch(selectType) {
				case 1: case 2: case 3: case 4:
					System.out.println("");
					manager.addContact(selectType);
					break;
				}
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
				Menu.showType();
				selectType = manager.sc.nextInt();
				manager.sc.nextLine();
				
				switch(selectType) {
				case 1: case 2: case 3: case 4:
					System.out.println("");
					manager.showData(selectType);
					break;
				}
				break;
			case 6:
				System.out.println("");
				System.out.println("Quit");
				return;
			}
		}
	}
}
