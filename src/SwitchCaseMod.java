import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two values. The second value must be higher than 0 and lower than 10.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = a % b;
		

		if (b > 0 && b < 10){

			switch (m) {
			case 1:
			System.out.println("one");
			break;

			case 2:
			System.out.println("two");
			break;

			case 3:
			System.out.println("three");
			break;

			case 4:
			System.out.println("four");
			break;

			case 5:
			System.out.println("five");
			break;

			case 6:
			System.out.println("six");
			break;

			case 7:
			System.out.println("seven");
			break;

			case 8:
			System.out.println("eight");
			break;

			case 9:
			System.out.println("nine");
			break;

		}
			

		} else {
			System.out.println("Please enter two values. The second value must be higher than 0 and lower than 10.");
		}


		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

	}

}
