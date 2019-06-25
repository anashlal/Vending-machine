package anas.hlal;

import java.util.*;

public class ProductsData implements IProduct {

	List<Product> productsList;
	Utmany u = new Utmany();
	Scanner sc = new Scanner(System.in);
	boolean checking = true;
	int remainsmanyentered;
	int manyentered;

	public void PrintProductName() {

	}

	public ProductsData() {

		productsList = new ArrayList<Product>();

		productsList.add(new Drick(0, "Vatten", 1, "cool"));
		productsList.add(new Drick(1, "Cola", 5, "cool"));
		productsList.add(new Drick(2, "Beer", 10, "cool"));
		productsList.add(new Annan(3, "Chips", 20, "salty"));
		productsList.add(new Annan(4, "godis", 50, "sweet"));
		productsList.add(new Annan(5, "chocklad", 100, "sweet"));
		productsList.add(new Mat(6, "Beff", 200, "hot"));
		productsList.add(new Mat(7, "Kycking", 500, "hot"));
		productsList.add(new Mat(8, "fish", 1000, "hot"));
	}

	public List<Product> printproductsList() {
		for (int i = 0; i < this.productsList.size(); i++) {
			this.productsList.get(i).PrintProductName();
		}
		return productsList;
	}

	public void PrintProductsMat() {
		for (int i = 0; i < this.productsList.size(); i++) {
			if (this.productsList.get(i) instanceof Mat) {
				this.productsList.get(i).PrintProductName();
			}
		}
	}

	public void PrintProductsDrick() {
		for (int i = 0; i < this.productsList.size(); i++) {
			if (this.productsList.get(i) instanceof Drick) {
				this.productsList.get(i).PrintProductName();
			}
		}
	}

	public void PrintProductsAnnan() {
		for (int i = 0; i < this.productsList.size(); i++) {
			if (this.productsList.get(i) instanceof Annan) {
				this.productsList.get(i).PrintProductName();
			}
		}
	}

	public int enterMoney() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("wellcomen to Quick bay Machine");

		System.out.println("Please enter the currency according to the following values:");

		for (Many g : Many.values()) {
			System.out.println(g.getVals());
		}
		return manyentered = sc.nextInt();

	}

	public ProductsData(List<Product> productsList, Scanner sc, boolean checking, int remainsmanyentered,
			int manyentered) {
		super();
		this.productsList = productsList;
		this.sc = sc;
		this.checking = checking;
		this.remainsmanyentered = remainsmanyentered;
		this.manyentered = manyentered;
	}

	public void Calcu(int manyentered, Product selected) {

		if (manyentered >= selected.getPris()) {

			System.out.println("Calculation" + " " + manyentered + "-" + selected.getPris());
			System.out.println(selected.getName() + " " + "was selected " + "\n|" + "Pris : " + selected.getPris()
					+ "\n|" + "OBS" + " " + selected.getMsg());
			remainsmanyentered = manyentered - selected.getPris();
			System.out.println("Remaining money" + " " + remainsmanyentered + " " + "SEK");
			u.remensAmant(remainsmanyentered);

		}

		else {

			System.out.println("Money is not enough please enter more amount ");
			int newAmount = sc.nextInt();
			manyentered = manyentered + newAmount;
			System.out.println("Remaining money" + remainsmanyentered);
		}
	}

	public int getRemains() {

		System.out.println(" your new amount is " + remainsmanyentered);
		return remainsmanyentered;
	}

}
