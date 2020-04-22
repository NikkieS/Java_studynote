package project;

import java.util.Scanner;

public class PhoneInfor3 {

	// 이름/전화번호/생일 3가지를 한꺼번에 100개 까지 저장할 수 있는 2D배열 생성
	String[][] arr = new String[100][3];
	private static Scanner sc;
	
	// 저장 메소드 (매개변수: 이름, 전화번호, 생일)
	void save(String name, String num, String bday) {
		for(int i=0; i<100; i++) {
			// 다음 빈공간에 저장한다
			if(arr[i][0]==null) {
				arr[i][0]=name;
				arr[i][1]=num;
				arr[i][2]=bday;
				break;
			}
		}
	}
	
	// 검색 메소드
	void search(String name) {
		for(int i=0; i<100; i++) {
			if(arr[i][0].equals(name)) {
				System.out.println("Name: "+arr[i][0]+", Phone number : "+arr[i][1]+", Birthday : "+arr[i][2]);
				break;
			}
			else	// 전화번호부에 없는 이름으로 검색했을 때
				System.out.println(name+" is not in your contacts.");
		}
		System.out.println(" ");
	}
	
	// 삭제 메소드
	void delete(String name) {
		for(int i=0; i<100; i++) {
			if(arr[i][0].equals(name)) {
				// 시작점: 이름이 들어가있는 인덱스, 끝점: 인덱스의 정보가 비어있지 않을때 까지
				for(int j=i; arr[j][0]!=null; j++) {
					arr[j][0]=arr[j+1][0];	//오른쪽을 왼쪽으로 당겨준다
					arr[j][1]=arr[j+1][1];
					arr[j][2]=arr[j+1][2];
				}break;
			}
			// 전화번호부에 없는 이름으로 검색했을 때
			else
				System.out.println(name+" is not in your contacts.");
		}
	}
	
	// 전체 출력 메소드
	void view() {
		for (String[] e : arr) {
			// 전화번호부가 비어있지 않을때 출력
			if(e[0]!=null) {
				System.out.println(e[0]+", "+e[1]+", "+e[2]);
				break;
			}
			// 전화번호부가 비어있을 때
			else {
				System.out.println("Your contact is empty.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		PhoneInfor3 data = new PhoneInfor3();
		System.out.println("Welcome to Phonebook Service");
		System.out.println("----------------------------");
		
		// 끝내기 전까지 무한반복
		while (true) {
			System.out.println(" ");
			System.out.println("To add a new number: A/a");
			System.out.println("To search by name: S/s");
			System.out.println("To delete contact by name: D/d");
			System.out.println("To view your contacts: V/v");
			System.out.println("To quit: q/Q");
			String choice = sc.next();
			
			if(choice.equals("A")||choice.equals("a")) {
				System.out.println("Enter the name.");
				String name = sc.next();
				System.out.println("Enter the number.");
				String num = sc.next();
				sc.nextLine();
				System.out.println("Enter the birthday.");
				String birthday = sc.nextLine();
				
				data.save(name, num, birthday);
			}
			
			else if(choice.equals("S")||choice.equals("s")) {
				System.out.println("Enter the name.");
				String name_s = sc.next();
				
				data.search(name_s);
			}
			
			else if(choice.equals("D")||choice.equals("d")) {
				System.out.println("Enter the name.");
				String name_d = sc.next();
				
				data.delete(name_d);
			}
			
			else if(choice.equals("V")||choice.equals("v")) {
				data.view();
			}
			
			else if(choice.equals("Q")||choice.equals("q")) {
				break;
			}
		}
	}
}
