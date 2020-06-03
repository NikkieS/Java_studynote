package phoneBook;

import java.util.List;

public class UnivManager {
	
	private UnivManager() {}
	private static UnivManager manager = new UnivManager();
	
	public static UnivManager getInstance() {
		return manager;
	}

	BasicDao dao = new BasicDao();

	public void univManager() {
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
			univInsert();
			break;
		case 2:
			univEdit();
			break;
		case 3:
			univDelete();
			break;
		case 4:
			univList();
			break;
		case 5:
			univSearch();
			break;
		}
	}

	private void univSearch() {
		
	}

	private void univList() {
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

	private void univDelete() {
		// TODO Auto-generated method stub
		
	}

	private void univEdit() {
		// TODO Auto-generated method stub
		
	}

	private void univInsert() {
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
		
		System.out.println("전공 : ");
		String pumajor = MainManager.sc.nextLine();
		
		System.out.println("학년 : ");
		int puyear = MainManager.sc.nextInt();
		
		int resultCnt = 0;
		
		Basic info = new Univ(dao.getKey(), pname, pnum, padd, pemail, pumajor, puyear);
		resultCnt = dao.Insert(info);
		
		if(resultCnt>0) {
			System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력이 되지않았습니다. 확인 후 재시도 해주세요.");
		}
	}
	}

