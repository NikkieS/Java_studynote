package phoneBook;

public class Univ extends Basic {
	private String pumajor;
	private int puyear;

	public Univ() {}
	
	public Univ(String pidx, String pname, String pnum, String padd, String pemail, String pumajor, int puyear) {
		super(pidx, "univ", pname, pnum, padd, pemail);
		this.pumajor = pumajor;
		this.puyear = puyear;
	}
	public String getPumajor() {
		return pumajor;
	}
	public int getPuyear() {
		return puyear;
	}
	
}
