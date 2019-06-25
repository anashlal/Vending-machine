package anas.hlal;

public class Utmany {

	public int remensAmant(int amant) {
		int thousands, fivehundred, Twohundred, hundred, fifty, twenty, ten, five, one;

		thousands = amant / 1000;
		fivehundred = amant % 1000 / 500;
		Twohundred = amant % 1000 % 500 / 200;
		hundred = amant % 1000 % 500 % 200 / 100;
		fifty = amant % 1000 % 500 % 200 % 100 / 50;
		twenty = amant % 1000 % 500 % 200 % 100 % 50 / 20;
		ten = amant % 1000 % 500 % 200 % 100 % 50 % 20 / 10;
		five = amant % 1000 % 500 % 200 % 100 % 50 % 20 % 10 / 5;
		one = amant % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 1;

		System.out.println("The Remains Is :" + " " + amant + " " + "SEK" + "You Will Collect " + "\n" + thousands
				+ "\t" + "Thousand" + "\n" + fivehundred + "\t" + "FiveHundred" + "\n" + Twohundred + "\t"
				+ "TwoHundred" + "\n" + hundred + "\t" + "Hundred" + "\n" + fifty + "\t" + "fivity" + "\n" + twenty
				+ "\t" + "Twinty" + "\n" + ten + "\t" + "tens" + "\n" + five + "\t" + "fives" + "\n" + one + "\t"
				+ "one");

		return amant;

	}
}