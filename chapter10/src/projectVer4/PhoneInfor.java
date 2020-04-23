package projectVer4;

public class PhoneInfor {
	
	protected String name;			//이름
	protected String phoneNumber;	//전화번호
	private String birthday;		//생년월일
	
	PhoneInfor(){
	}
	
	PhoneInfor(String name, String num){
		this(name,num, "No data entered.");
	}
	
	PhoneInfor(String name, String num, String bday){
		this.name = name;
		this.phoneNumber = num;
		this.birthday = bday;
	}
	
	void show() {
		System.out.println("Name : "+name+", Phone number : "+phoneNumber);
	}
	
	// name 속성값과 전달받은 문자열을 비교해서 반환
	boolean check(String name) {
		return this.name.equals(name);
	}

}
