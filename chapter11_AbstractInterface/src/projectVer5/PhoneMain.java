package projectVer5;

public class PhoneMain {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();	
		
		while(true) {
			
			System.out.println("---------------------------------");
			System.out.println("Enter a menu option");
			System.out.println(Menu.INSERT_NEW+". To add a new number");
			System.out.println(Menu.SEARCH+". To search by name");
			System.out.println(Menu.DELETE+". To delete contact by name");
			System.out.println(Menu.VIEW_ALL+". To view entire contacts");
			System.out.println(Menu.VIEW_GROUP+". To view contacts by group");
			System.out.println(Menu.EDIT+". To edit contact info");
			System.out.println(Menu.EXIT+". To quit");
			System.out.println("---------------------------------");
			
			int selectMenu;
			
			try {
				selectMenu = manager.sc.nextInt();
				if(!(selectMenu>=Menu.INSERT_NEW && selectMenu<=Menu.EXIT)) {
					System.out.println("Number out of range.\nReturning to menu.");
				}
			} catch(Exception e){
				System.out.println("Your choice is not in the option.\nReturning to menu.");
				manager.sc.nextLine();
				continue;
			}
			
			switch(selectMenu) {
			case Menu.INSERT_NEW:
				System.out.println("");
				
				System.out.println("---------------------------------");
				System.out.println("Choose an option");
//				System.out.println(Menu.REG+". To access regular contacts");
				System.out.println(Menu.UNIV+". To access university contacts");
				System.out.println(Menu.COMP+". To access company contacts");
				System.out.println(Menu.CLUB+". To access club contacts");
				System.out.println("---------------------------------");

				int selectType;
				
				// 잘못된 입력을 했을때 return해서 메소드를 끝내줌
				try {
					selectType = manager.sc.nextInt();
					if(!(selectType>=Menu.UNIV && selectType<=Menu.CLUB)) {
						System.out.println("Number out of range.\nReturning to menu.");
					}
					manager.sc.nextLine();
				} catch(Exception e){
					System.out.println("Your choice is not in the option.\nReturning to menu.");
					manager.sc.nextLine();
					continue;
				}
				
				switch(selectType) {
				case Menu.UNIV: case Menu.COMP: case Menu.CLUB:
					System.out.println("");
					manager.addContact(selectType);
					break;
				}
				break;
			case Menu.SEARCH:
				System.out.println("");
				manager.searchInfo();
				break;
			case Menu.DELETE:
				System.out.println("");
				manager.deleteInfo();
				break;
			case Menu.VIEW_ALL:
				System.out.println("");
				manager.showAllData();
				break;
			case Menu.VIEW_GROUP:
				System.out.println("");
				manager.showGroupData();
				break;
			case Menu.EDIT:
				System.out.println("");
				manager.editInfo();
				break;
			case Menu.EXIT:
				System.out.println("");
				System.out.println("Quit");
				return;
			}
		}
	}
}
