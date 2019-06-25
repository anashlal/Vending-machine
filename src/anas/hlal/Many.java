package anas.hlal;

public enum Many {

	KR_1(1, "SEK_1"), KR_5(5, "SEK_5"), KR_10(10, "SEK_10"), KR_20(20, "SEK_20"), KR_50(50, "SEK_50"),
	KR_100(100, "SEK_100"), KR_200(200, "SEK_200"), KR_500(500, "SEK_500"), KR_1000(1000, "SEK_1000");

	public int valn;
	public String vals;

	private Many(int en, String ens) {
		this.valn = en;
		this.vals = ens;
	}

	public void printenum() {
		System.out.println(Many.this.valn + this.vals);
	}

	public int getValn() {
		return valn;
	}

	public void setValn(int valn) {
		this.valn = valn;
	}

	public String getVals() {
		return vals;
	}

	public void setVals(String vals) {
		this.vals = vals;
	}

}
