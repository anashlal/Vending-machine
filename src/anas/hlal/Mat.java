package anas.hlal;

public class Mat extends Product {

	public Mat(int iD, String name, int pris, String msg) {
		super(iD, name, pris, msg);
	}

	@Override
	public void PrintProductInformation() {
		System.out.println("Mat: " + this.getName());
	}

}
