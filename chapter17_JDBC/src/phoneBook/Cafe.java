package phoneBook;

public class Cafe extends Basic{
	private String pcafename;
	private String pcafenickname;
	
	public Cafe() {}
	
	public Cafe(String pname, String pnum, String pcafename, String pcafenickname) {
		super(pname, pnum);
		this.pcafename = pcafename;
		this.pcafenickname = pcafenickname;
	}
	public Cafe(String pcafename, String pcafenickname) {
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
