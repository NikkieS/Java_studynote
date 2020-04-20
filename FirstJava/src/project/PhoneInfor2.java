package project;

import java.util.Scanner;

public class PhoneInfor2 {
	Scanner sc = new Scanner(System.in);
	
	String name;		//이름
	String phoneNumber;	//전화번호
	String birthday;	//생년월일
	
	PhoneInfor2(String name, String num){
		this.name = name;
		this.phoneNumber = num;
		this.birthday = "";
	}
	
	PhoneInfor2(String name, String num, String bday){
		this.name = name;
		this.phoneNumber = num;
		this.birthday = bday;
	}
	
	void show() {
		System.out.println("이름 : "+name+", 전화번호 : "+phoneNumber+", 생년월일 : "+birthday);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			System.out.println("전화번호를 입력해주세요.");
			String num = sc.next();
			sc.nextLine();
			System.out.println("생년월일을 입력해주세요.");
			String birthday = sc.nextLine();
			
			// data
			PhoneInfor data = new PhoneInfor(name, num, birthday);
			
			data.show();
			
			System.out.println("종료하시겠습니까? Y/N");
			String exit = sc.next();
			
			if (exit.equals("Y")||exit.equals("y"))
				break;
		}
	}
}
