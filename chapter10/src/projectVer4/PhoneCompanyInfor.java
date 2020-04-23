package projectVer4;

import java.util.Scanner;

public class PhoneCompanyInfor extends PhoneInfor2 {
	private String company;		//직장
	
	final PhoneInfor[] pCBooks;
	
	int cnt;
	
	Scanner sc;
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);
		this.company = company;
		pCBooks=new PhoneInfor2[100];
		cnt=0;
		sc=new Scanner(System.in);
	}
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email,"No company data entered");
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		if(company!=null) {
			System.out.println("Company : "+company);
		}
	}	
}
