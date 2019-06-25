package anas.hlal;

import java.util.*;

public class App {

	public static void main(String[] args) {

		ProductsData data = new ProductsData();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;
		boolean working = true;

		int manyentered = data.enterMoney();

		while (working) {

			System.out.println("please select by ID number :");

			List<Product> list = data.printproductsList();
			x = sc.nextInt();

			data.Calcu(manyentered, list.get(x));
			System.out.println("You want to buy more please select 1 to reopen or 2 to close ");
			x = sc.nextInt();

			if (x == 1) {
				manyentered = data.getRemains();
				working = true;
			}

			else {
				System.out.println("Thanks enjoy your producat , please collect your remains money ");
				System.out.println(data.getRemains() + "has been returned");
				working = false;
			}

		}
	}

}
