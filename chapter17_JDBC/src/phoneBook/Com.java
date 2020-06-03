package phoneBook;

public class Com extends Basic {
	private String pcomname;
	private String pcomdept;
	private String pcomjob;
	
	public Com() {}
	
	public Com(String pidx, String pname, String pnum, String padd, String pemail, String pcomname, String pcomdept, String pcomjob) {
		super(pidx, "com", pname, pnum, padd, pemail);
		this.pcomname = pcomname;
		this.pcomdept = pcomdept;
		this.pcomjob = pcomjob;
	}
	public String getPcomname() {
		return pcomname;
	}
	public String getPcomdept() {
		return pcomdept;
	}
	public String getPcomjob() {
		return pcomjob;
	}
}
