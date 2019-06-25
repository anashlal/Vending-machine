package anas.hlal;

public class Drick extends Product {

	private boolean isHot;

	public boolean getIsHot() {
		return isHot;
	}

	public void setIsHot(boolean isHot) {
		this.isHot = isHot;
	}

	public Drick(int iD, String name, int pris, String msg) {
		super(iD, name, pris, msg);
	}

	@Override
	public void PrintProductInformation() {
		System.out.println("Drink: " + this.getName() + "Is Hot: " + this.getIsHot());
	}

}
