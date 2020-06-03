package phoneBook;

public class ComManager {
	
	private ComManager() {}
	private static ComManager manager = new ComManager();
	
	public static ComManager getInstance() {
		return manager;
	}
	
	BasicDao dao = new BasicDao();

	public void comManager() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("-----------------------");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("5. 검색");
		System.out.println("-----------------------");
		
		int choice = MainManager.sc.nextInt();
		switch(choice) {
		case 1:
			comInsert();
			break;
		case 2:
			comEdit();
			break;
		case 3:
			comDelete();
			break;
		case 4:
			comList();
			break;
		case 5:
			comSearch();
			break;
		}
	}

	private void comSearch() {
		// TODO Auto-generated method stub
		
	}

	private void comList() {
		// TODO Auto-generated method stub
		
	}

	private void comDelete() {
		// TODO Auto-generated method stub
		
	}

	private void comEdit() {
		// TODO Auto-generated method stub
		
	}

	private void comInsert() {
		// TODO Auto-generated method stub
		
	}
}
