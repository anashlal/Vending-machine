package anas.hlal;

public class Annan extends Product {

	public Annan(int iD, String name, int pris, String msg) {
		super(iD, name, pris, msg);

	}

	@Override
	public void PrintProductInformation() {
		System.out.println("Annan: " + this.getName());
	}
}
