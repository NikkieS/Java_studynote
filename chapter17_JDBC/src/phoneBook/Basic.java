package phoneBook;

public class Basic {
	private String pidx;
	private String pname;
	private String pnum;
	private String padd;
	private String pemail;
	private String ptype;
	
	public Basic() {}
	
	public Basic(String pidx, String ptype, String pname, String pnum, String padd, String pemail) {
		this.pidx = pidx;
		this.ptype = ptype;
		this.pname = pname;
		this.pnum = pnum;
		this.padd = padd;
		this.pemail = pemail;
	}
	public String getPidx() {
		return pidx;
	}
	public String getPname() {
		return pname;
	}
	public String getPnum() {
		return pnum;
	}
	public String getPadd() {
		return padd;
	}
	public String getPemail() {
		return pemail;
	}

	public String getPtype() {
		return ptype;
	}

}
