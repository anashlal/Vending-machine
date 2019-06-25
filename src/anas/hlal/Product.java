package anas.hlal;

public abstract class Product implements IProduct {

	private int ID;
	private String name;
	private int pris;
	private String msg;

	public Product(int iD, String name, int pris, String msg) {
		super();
		ID = iD;
		this.name = name;
		this.pris = pris;
		this.msg = msg;
	}

	public int getID() {

		return ID;
	}

	public String getName() {
		return name;
	}

	public int getPris() {
		return pris;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void PrintProductName() {
		System.out.println("Product [ID=" + ID + ", name=" + name + ", pris=" + pris + "]");
	}

	public abstract void PrintProductInformation();
}