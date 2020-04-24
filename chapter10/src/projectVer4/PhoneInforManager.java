package projectVer4;

import java.util.Scanner;

public class PhoneInforManager {
	
	final PhoneInfor[] pBooks;
		
	// 입력된 친구의 정보 개수 --> 입력된 배열의 요소 개수
	// 1. 참조할 때 반복의 횟수
	// 2. 새로운 객체를 저장할때 index로 사용
	int cnt;
	
	Scanner sc;
	
	// 초기화 생성자
	public PhoneInforManager() {
		// 배열 초기화
		pBooks = new PhoneInfor[100];
		// 저장개수 초기화
		cnt = 0;
		// Scanner 객체 초기화
		sc = new Scanner(System.in);
	}
	
	// 배열에 최상위클래스인 PhoneInfor 타입의 참조값을 저장 (다른 모든 하위클래스를 자동 형변환 시켜준다)
	private void addInfo(PhoneInfor info) {
		pBooks[cnt++] = info;
	}
	
	// 저장 : 이름, 전화번호, 주소, 이메일, 타입에 따른 추가정보
	// 사용자 요청에 맞는 인스턴스 생성
	public void addContact(int type) {
		String name, phoneNumber, address, email, major, year, company, club;
		// 배열의 요소 대입
		
		System.out.println("Enter the name."); name = sc.nextLine();
		
		System.out.println("Enter the number."); phoneNumber = sc.nextLine();
		
		System.out.println("Enter the address."); address = sc.nextLine();
		
		System.out.println("Enter the email."); email = sc.nextLine();
		
		// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
		switch(type) {
		case 1:
			addInfo(new PhoneInfor2(name, phoneNumber, address, email));
			break;
		case 2:
			System.out.println("Enter the major."); major = sc.nextLine();
			
			System.out.println("Enter the year."); year = sc.nextLine();
			
			// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
			if(major==null || major.trim().isEmpty() || year==null || year.trim().isEmpty()) {	//.trim String 양쪽 공백 삭제
				addInfo(new PhoneUnivInfor(name, phoneNumber, address, email));
				break;
			}
			else {
				addInfo(new PhoneUnivInfor(name, phoneNumber, address, email, major, year));
				break;
			}
		case 3:
			System.out.println("Enter the company."); company = sc.nextLine();
			
			if(company==null || company.trim().isEmpty()) {	//.trim String 양쪽 공백 삭제
				addInfo(new PhoneCompanyInfor(name, phoneNumber, address, email));
				break;
			}
			else {
				addInfo(new PhoneCompanyInfor(name, phoneNumber, address, email, company));
				break;
			}
		case 4:
			System.out.println("Enter the club."); club = sc.nextLine();
			addInfo(new PhoneClubInfor(name, phoneNumber, address, email, club));
			break;
		}
		System.out.println("Contact info of "+name+" has been successfully added.");
		System.out.println("");
	}
	
	// 배열에서 이름을 기준으로 검색 후 index 값을 반환
	int searchIndex(String name) {
		int idx = -1;
		
		for(int i=0; i<cnt; i++) {
			if(pBooks[i].check(name)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	// 검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
	void searchInfo() {
		System.out.println("Enter the name.");
		String name = sc.nextLine();
		
		int searchIndex = searchIndex(name);
		
		if (searchIndex<0) {
			System.out.println(name+" is not in your contacts.");
		}
		else
			pBooks[searchIndex].show();
	}
	
	// 삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보 삭제
	void deleteInfo() {
		System.out.println("Enter the name.");
		String name = sc.nextLine();
		
		int searchIndex = searchIndex(name);
		
		if(searchIndex<0) {
			System.out.println(name+" is not in your contacts.");
		}
		else {
			// index부터 저장된 위치까지 왼쪽으로 쉬프트
			for(int i=searchIndex; i<cnt-1; i++) {
				pBooks[i]=pBooks[i+1];
			}
			cnt-=1;
			
			System.out.println("Contact info of "+name+" has been successfully deleted.");
		}
	}
	
	// 전화번호부 전체 리스트 출력
	void showAllData() {
		for(int i=0; i<cnt; i++) {
			pBooks[i].show();
			System.out.println(" ");
		}
	}
	
	// 그룹별 리스트 출력
	void showData(int type) {
		boolean search = false;
		for(int i=0; i<cnt; i++) {
			if(pBooks[i].group()==type) {
				pBooks[i].show();
				System.out.println(" ");
				search = true;
			}
		}
		if (search == false) {
			System.out.println("This group is empty");
		}
	}
}
