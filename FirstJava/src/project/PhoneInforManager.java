package project;

import java.util.Scanner;

public class PhoneInforManager {
	
	// 인스턴스 생성
	PhoneInfor createInstance() {
			
			PhoneInfor info = null;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the name.");
			String name = sc.nextLine();
			
			System.out.println("Enter the number.");
			String phoneNumber = sc.nextLine();
			
			System.out.println("Enter the birthday.");
			String birthday = sc.nextLine();
			
			
			
			// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
			if(birthday==null || birthday.trim().isEmpty()) {	//.trim String 양쪽 공백 삭제
				info= new PhoneInfor(name, phoneNumber);
			}
			else {
				info= new PhoneInfor(name,phoneNumber,birthday);
			}
			
			return info;
		}
	
	public static void main(String[] args) {
		PhoneInforManager manager = new PhoneInforManager();
		
		// 불필요한 변수 생성을 막기위함
		PhoneInfor info = null;
		
		while(true) {
			info = manager.createInstance();
			info.show();
		}
		
	}
}
