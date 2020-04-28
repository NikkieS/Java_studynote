package projectVer5;

public class MenuOption {
	public static void showMenu() {
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
	}
	
	public static void showType() {
		System.out.println("---------------------------------");
		System.out.println("Choose an option");
		System.out.println(Menu.UNIV+". To access university contacts");
		System.out.println(Menu.COMP+". To access company contacts");
		System.out.println(Menu.CLUB+". To access club contacts");
		System.out.println("---------------------------------");
	}
}
