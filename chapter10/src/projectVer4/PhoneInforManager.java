package projectVer4;

import java.util.Scanner;

public class PhoneInforManager {
	
	final PhoneInfor[] pBooks;
		
	// 입력된 친구의 정보 개수 --> 입력된 배열의 요소 개수
	// 1. 참조할 때 반복의 횟수
	// 2. 새로운 객체를 저장할때 index로 사용
	int cnt;
	
	Scanner sc;
	
	public PhoneInforManager() {
		// 배열 초기화
		pBooks = new PhoneInfor[100];
		// 저장개수 초기화
		cnt = 0;
		// Scanner 객체 초기화
		sc = new Scanner(System.in);
	}
	
	// 저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
	// 배열에 PhoneInfor 타입의 참조값을 저장
	void addInfo(int type) {
		// 배열의 요소 대입
		PhoneInfor info = null;
		
		System.out.println("Enter the name.");
		String name = sc.nextLine();
		
		System.out.println("Enter the number.");
		String phoneNumber = sc.nextLine();
		
		System.out.println("Enter the address.");
		String address = sc.nextLine();
		
		System.out.println("Enter the email.");
		String email = sc.nextLine();
		
		// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
		switch(type) {
		case 1:
			System.out.println("Enter the major.");
			String major = sc.nextLine();
			
			System.out.println("Enter the year.");
			String year = sc.nextLine();
			
			// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
			if(major==null || major.trim().isEmpty() || year==null || year.trim().isEmpty()) {	//.trim String 양쪽 공백 삭제
				info = new PhoneUnivInfor(name, phoneNumber, address, email);
				break;
			}
			else {
				info = new PhoneUnivInfor(name, phoneNumber, address, email, major, year);
				break;
			}
		case 2:
			System.out.println("Enter the company.");
			String company = sc.nextLine();
			
			if(company==null || company.trim().isEmpty()) {	//.trim String 양쪽 공백 삭제
				info = new PhoneCompanyInfor(name, phoneNumber, address, email);
				break;
			}
			else {
				info = new PhoneCompanyInfor(name, phoneNumber, address, email, company);
				break;
			}
		case 3:
			info = new PhoneInfor2(name, phoneNumber, address, email);
			break;
		}
		
		pBooks[cnt] = info;
		cnt++;
		
//		switch(type) {
//		case 1:
//			// 배열의 요소 대입
//			pBooks[cnt] = createInstance(type);
//			// 등록된 정보의 개수를 증가
//			cnt++;
//			break;
//		case 2:
//			// 배열의 요소 대입
//			pBooks[cnt] = createInstance(type);
//			// 등록된 정보의 개수를 증가
//			cnt++;
//			break;
//		case 3:
//			// 배열의 요소 대입
//			pBooks[cnt] = createInstance(type);
//			// 등록된 정보의 개수를 증가
//			cnt++;
//			break;
//		}
	}
	
	// PhoneInfor 객체를 생성
//	PhoneInfor createInstance(int type) {
//		PhoneInfor info = null;
//			
//		System.out.println("Enter the name.");
//		String name = sc.nextLine();
//		
//		System.out.println("Enter the number.");
//		String phoneNumber = sc.nextLine();
//		
//		System.out.println("Enter the address.");
//		String address = sc.nextLine();
//		
//		System.out.println("Enter the email.");
//		String email = sc.nextLine();
//		
//		// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
//		switch(type) {
//		case 1:
//			System.out.println("Enter the major.");
//			String major = sc.nextLine();
//			
//			System.out.println("Enter the year.");
//			String year = sc.nextLine();
//			
//			// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
//			if(major==null || major.trim().isEmpty() || year==null || year.trim().isEmpty()) {	//.trim String 양쪽 공백 삭제
//				info = new PhoneUnivInfor(name, phoneNumber, address, email);
//				break;
//			}
//			else {
//				info = new PhoneUnivInfor(name, phoneNumber, address, email, major, year);
//				break;
//			}
//		case 2:
//			System.out.println("Enter the company.");
//			String company = sc.nextLine();
//			
//			if(company==null || company.trim().isEmpty()) {	//.trim String 양쪽 공백 삭제
//				info = new PhoneCompanyInfor(name, phoneNumber, address, email);
//				break;
//			}
//			else {
//				info = new PhoneCompanyInfor(name, phoneNumber, address, email, company);
//				break;
//			}
//		case 3:
//			info = new PhoneInfor2(name, phoneNumber, address, email);
//			break;
//		}
//		
//		return info;
//	}
	
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
	
	// 전체 리스트 출력
	void showAllData() {
		for(int i=0; i<cnt; i++) {
			pBooks[i].show();
			System.out.println(" ");
		}
	}
	
	// 종류별 리스트 출력
	void showData(int type) {
		for(int i=0; i<cnt; i++) {
			if(pBooks[i].group()==type) {
				pBooks[i].show();
				System.out.println(" ");
			}
		}
	}
}
