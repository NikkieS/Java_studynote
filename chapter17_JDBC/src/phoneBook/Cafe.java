package phoneBook;

public class Cafe extends Basic{
	private String pcafename;
	private String pcafenickname;
	
	public Cafe() {}
	
	public Cafe(String pidx, String pname, String pnum, String padd, String pemail, String pcafename, String pcafenickname) {
		super(pidx, "cafe", pname, pnum, padd, pemail);
		this.pcafename = pcafename;
		this.pcafenickname = pcafenickname;
	}

	public String getPcafename() {
		return pcafename;
	}
	public String getPcafenickname() {
		return pcafenickname;
	}
}
