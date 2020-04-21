package project;

import java.util.Scanner;

public class PhoneInfor3 {
	Scanner sc = new Scanner(System.in);
	
//	String name;		//이름
//	String phoneNumber;	//전화번호
//	String birthday;	//생년월일
	
	String[][] arr = new String[100][3];
	
	void save(String name, String num, String bday) {
		for(int i=0; i<100; i++) {
			if(arr[i][0]==null) {
				arr[i][0]=name;
				arr[i][1]=num;
				arr[i][2]=bday;
				break;
			}
		}
	}
	
	void search(String name) {
		for(int i=0; i<100; i++) {
			if(arr[i][0].equals(name)) {
				System.out.println("이름: "+arr[i][0]+", 전화번호 : "+arr[i][1]+", 생년월일 : "+arr[i][2]);
				break;
			}
		}
		System.out.println(" ");
	}
	
	void delete(String name) {
		for(int i=0; i<100; i++) {
			if(arr[i][0].equals(name)) {
				for(int j=i; j<arr.length-1; j++) {
					System.arraycopy(arr[j+1], 0, arr[j], 0, 3);
				}
			}
		}
	}
	
	void show(String name) {
		for(int i=0; i<100; i++) {
			if(arr[i][0]==name) {
				System.out.println("이름 : "+arr[i][0]+", 전화번호 : "+arr[i][1]+", 생년월일 : "+arr[i][2]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfor3 data = new PhoneInfor3();
		System.out.println("Welcome to Phonebook Service");
		System.out.println("----------------------------");
		
		while (true) {
			System.out.println("To add a new number: A/a");
			System.out.println("To search by name: S/s");
			System.out.println("To delete contact by name: D/d");
			System.out.println("To quit: q/Q");
			String choice = sc.next();
			
			if(choice.equals("A")||choice.equals("a")) {
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the number.");
				String num = sc.next();
				sc.nextLine();
				System.out.println("Enter the birthday.");
				String birthday = sc.nextLine();
				
				data.save(name, num, birthday);
			}
			
			else if(choice.equals("S")||choice.equals("s")) {
				System.out.println("Enter the name");
				String name_s = sc.next();
				
				data.search(name_s);
			}
			
			else if(choice.equals("D")||choice.equals("d")) {
				System.out.println("Enter the name");
				String name_d = sc.next();
				
				data.delete(name_d);
			}
			
			else if(choice.equals("Q")||choice.equals("q")) {
				break;
			}
		}
		
		for(int i=0; i<data.arr.length; i++) {
			System.out.print(data.arr[i][0]+", ");
			System.out.print(data.arr[i][1]+", ");
			System.out.println(data.arr[i][2]);
		}
	}
}
