package projectVer5;

public class PhoneCompanyInfor extends PhoneInfor {
	private String company;		//직장
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);
		this.company = company;
	}
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email,"No data entered");
	}

	@Override
	public void showData() {
		super.showBasicInfo();
		System.out.print(", Group : Company, ");
		if(company!=null) {
			System.out.println("Company name: "+company);
		}
	}
}
