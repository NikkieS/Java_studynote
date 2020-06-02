package phoneBook;

import java.util.List;

public class BasicManager {
	BasicDao dao = new BasicDao();
	
	public void basicManager() {
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
			basicInsert();
			break;
		case 2:
			basicEdit();
			break;
		case 3:
			basicDelete();
			break;
		case 4:
			basicList();
			break;
		case 5:
			basicSearch();
			break;
		}
	}

	private void basicSearch() {
		
	}

	private void basicList() {
		List<Basic> list = dao.basicList();
		
		if(!list.isEmpty() && list != null) {
			for(int i=0; i<list.size(); i++) {
				System.out.printf(list.get(i).getPname()+"\t");
				System.out.printf(list.get(i).getPnum()+"\t");
				System.out.printf(list.get(i).getPadd()+"\t");
				System.out.printf(list.get(i).getPemail()+"\n");
			}
		} else {
			System.out.println("입력된 데이터가 없습니다.");
		}
	}

	private void basicDelete() {
		// TODO Auto-generated method stub
		
	}

	private void basicEdit() {
		// TODO Auto-generated method stub
		
	}

	private void basicInsert() {
		System.out.println("-------------------------");
		System.out.println("연락처를 입력해주세요.");
		System.out.println("-------------------------");
		
		System.out.println("이름 : ");
		String pname = MainManager.sc.nextLine();
		
		System.out.println("전화번호 : ");
		String pnum = MainManager.sc.nextLine();
		
		System.out.println("주소 : ");
		String padd = MainManager.sc.nextLine();
		
		System.out.println("이메일 : ");
		String pemail = MainManager.sc.nextLine();
		
		Basic info = null;
		
		if(padd.trim().isEmpty() && pemail.trim().isEmpty()) {
			info = new Basic(pname, pnum);
		} else {
			info = new Basic(pname, pnum, padd, pemail);
		}
		
		int resultCnt = dao.basicInsert(info);
	}
}
