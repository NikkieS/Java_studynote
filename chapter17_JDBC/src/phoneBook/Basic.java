package phoneBook;

public class Basic {
	private int pidx=0;
	private String pname;
	private String pnum;
	private String padd;
	private String pemail;
	
	public Basic() {}
	
	public Basic(String pname, String pnum) {
		this.pidx = pidx++;
		this.pname = pname;
		this.pnum = pnum;
	}
	public Basic(String pname, String pnum, String padd, String pemail) {
		this.pidx = pidx++;
		this.pname = pname;
		this.pnum = pnum;
		this.padd = padd;
		this.pemail = pemail;
	}
	public int getPidx() {
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

}
