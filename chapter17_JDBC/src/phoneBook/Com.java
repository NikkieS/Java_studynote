package phoneBook;

public class Com extends Basic {
	private String pcomname;
	private String pcomdept;
	private String pcomjob;
	
	public Com() {}
	
	public Com(String pname, String pnum, String pcomname, String pcomdept, String pcomjob) {
		super(pname, pnum);
		this.pcomname = pcomname;
		this.pcomdept = pcomdept;
		this.pcomjob = pcomjob;
	}

	public Com(String pcomname, String pcomdept, String pcomjob) {
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
