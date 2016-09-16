package quiz1;

import java.util.Scanner;

public class football {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int ATT;
		int COMP;
		int YDS;
		int TD;
		int INT;

		System.out.println("Attempted passes:");
		ATT = input.nextInt();

		System.out.println("# of Completions:");
		COMP = input.nextInt();

		System.out.println("# of passing yards:");
		YDS = input.nextInt();

		System.out.println("# of touchdown passes:");
		TD = input.nextInt();

		System.out.println("# of interceptions:");
		INT = input.nextInt();

		input.close();

		double a = ((COMP / ATT - .3) * 5);

		double b = ((YDS / ATT - 3) * .25);

		double c = ((TD / ATT) * 20);

		double d = (2.375 - ((INT / ATT) * 25));

		double passerRating = (((a + b + c + d) / 6) * 100);

		System.out.print("Your passer rating is " + passerRating);

	}

}
