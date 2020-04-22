package project;
/*작성자 : 송가람
작성일 : 2020.04.20
작성내용 : 전화번호 관리 프로그램 (이름, 전화번호, 생년월일)
*/

public class PhoneInfor {
	/*
	 * PhoneInfor 라는 이름의 클래스를 정의해 보자. 클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 저장된 데이터의
	 * 적절한 출력이 가능하도록 메소드 정의 단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.
	 */

	// 1. 전화번호 저장
	// 2. 전화번호 정보 view (list: 전화번호, 이름, 분류)
	// 3. 전화번호 검색
	// 4. 전화번호 삭제
	String name;		//이름
	String phoneNumber;	//전화번호
	String birthday;	//생년월일
	
	PhoneInfor(){
	}
	
	PhoneInfor(String name, String num){
		this(name,num, "입력된 값이 없습니다.");
	}
	
	PhoneInfor(String name, String num, String bday){
		this.name = name;
		this.phoneNumber = num;
		this.birthday = bday;
	}
	
	void show() {
		System.out.println("이름 : "+name+", 전화번호 : "+phoneNumber+", 생년월일 : "+birthday);
	}
	public static void main(String[] args) {
		// data1
		PhoneInfor data1 = new PhoneInfor("철수","000","0420");
		// data2
		PhoneInfor data2 = new PhoneInfor("영희","000");
		// data3
		PhoneInfor data3 = new PhoneInfor();
		
		data1.show();
		data2.show();
		data3.show();

	}
}
