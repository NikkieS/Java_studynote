package projectVer5;

public class PhoneMain {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();	
		
		while(true) {
			MenuOption.showMenu();
			try {
				int selectMenu = optionMenu(manager.sc.nextInt());
				
				switch(selectMenu) {
				case Menu.INSERT_NEW:
					System.out.println("");
					
					MenuOption.showType();

					int selectType = optionType(manager.sc.nextInt());
					
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
			}catch(OptionInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			catch(Exception e) {
				System.out.println("Please put numbers only.\nReturning to menu.");
				manager.sc.nextLine();
				continue;
			}
		}
	}
	static int optionMenu(int num) throws OptionInputException{
		if(num<1||num>7) {
			OptionInputException excpt = new OptionInputException();
			throw excpt;
		}
		return num;
	}
	static int optionType(int num) throws OptionInputException{
		if(num<1||num>3) {
			OptionInputException excpt = new OptionInputException();
			throw excpt;
		}
		return num;
	}
}
