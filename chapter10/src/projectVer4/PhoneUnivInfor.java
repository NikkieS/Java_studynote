package projectVer4;

import java.util.Scanner;

public class PhoneUnivInfor extends PhoneInfor2 {
	private String major;		//전공
	private String year;		//학년
	
	int cnt;
	
	Scanner sc;
	
	final PhoneInfor[] pUBooks;
	
	PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email);
		this.major=major;
		this.year=year;
		pUBooks=new PhoneInfor2[100];
		cnt=0;
		sc=new Scanner(System.in);
	}
	
	PhoneUnivInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email, "No major data entered", "No year data enetered");
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		if(major!=null && year!=null) {
			System.out.println("Major : "+major+", Year : "+year);
		}
		else if(major!=null && year==null) {
			System.out.println("Major : "+major);
		}
		else if(major==null && year!=null) {
			System.out.println("Year : "+year);
		}
	}
	
	
}
