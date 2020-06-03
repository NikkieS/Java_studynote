package phoneBook;

import java.util.List;

public class BasicManager {
	BasicDao dao = new BasicDao();
	
	private BasicManager() {
		
	}
	private static BasicManager manager = new BasicManager();
	
	public static BasicManager getInstance() {
		return manager;
	}
	
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
			System.out.println(" 이름\t       전화번호\t       위치\t\t\t이메일");
			System.out.println("-----------------------------------------------------------");
			for(int i=0; i<list.size(); i++) {
				System.out.printf("%5s", list.get(i).getPname()+"\t");
				System.out.printf("%15s", list.get(i).getPnum()+"\t");
				System.out.printf("%10s", list.get(i).getPadd()+"\t");
				System.out.printf("%18s", list.get(i).getPemail()+"\n");
			}
			System.out.println("-----------------------------------------------------------");
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
		MainManager.sc.nextLine();
		String pname = MainManager.sc.nextLine();
		
		System.out.println("전화번호 : ");
		String pnum = MainManager.sc.nextLine();
		
		System.out.println("주소 : ");
		String padd = MainManager.sc.nextLine();
		
		System.out.println("이메일 : ");
		String pemail = MainManager.sc.nextLine();
		
		int resultCnt = 0;
		

		Basic info = new Basic(dao.getKey(), "basic", pname, pnum, padd, pemail);
		resultCnt = dao.Insert(info);
		
		if(resultCnt>0) {
			System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력이 되지않았습니다. 확인 후 재시도 해주세요.");
		}
	}
}
