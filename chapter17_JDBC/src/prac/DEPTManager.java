package prac;

import java.util.List;

public class DEPTManager {
	DeptDao dao = new DeptDao();
	
	public void deptManager() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("-----------------------");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("5. 검색");
		System.out.println("-----------------------");
		
		int choice = ERPManager.kb.nextInt();
		switch(choice) {
		case 1:
			//deptInsert();
			break;
		case 2:
			//deptEdit();
			break;
		case 3:
			//deptDelete();
			break;
		case 4:
			deptList();
			break;
		case 5:
			//deptSearch();
			break;
		}
	}
	
	public void deptList() {
		List<Dept> deptList = dao.deptList();
		
		if(!deptList.isEmpty() && deptList != null) {
			for(int i=0; i<deptList.size(); i++) {
				System.out.printf("%5s", deptList.get(i).getDeptno()+"\t");
				System.out.printf("%12s", deptList.get(i).getDname()+"\t");
				System.out.printf("%12s", deptList.get(i).getLoc()+"\n");
			}
		} else {
			System.out.println("입력된 데이터가 없습니다.");
		}
	}

}
