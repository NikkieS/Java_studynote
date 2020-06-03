package phoneBook;

public class CafeManager {
	
	private CafeManager() {}
	private static CafeManager manager = new CafeManager();
	
	public static CafeManager getInstance() {
		return manager;
	}
	
	BasicDao dao = new BasicDao();

	public void cafeManager() {
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
			cafeInsert();
			break;
		case 2:
			cafeEdit();
			break;
		case 3:
			cafeDelete();
			break;
		case 4:
			cafeList();
			break;
		case 5:
			cafeSearch();
			break;
		}
	}

	private void cafeSearch() {
		// TODO Auto-generated method stub
		
	}

	private void cafeList() {
		// TODO Auto-generated method stub
		
	}

	private void cafeDelete() {
		// TODO Auto-generated method stub
		
	}

	private void cafeEdit() {
		// TODO Auto-generated method stub
		
	}

	private void cafeInsert() {
		// TODO Auto-generated method stub
		
	}
}
