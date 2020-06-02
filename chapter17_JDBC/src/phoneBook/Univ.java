package phoneBook;

public class Univ extends Basic {
	private String pumajor;
	private int puyear;
	

	public Univ() {}
	public Univ(String pname, String pnum, String pumajor, int puyear) {
		super(pname, pnum);
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
