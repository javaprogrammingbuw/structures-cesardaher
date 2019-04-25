import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter three values.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = a + b + c;
		int mean = (a + b + c)/3;
		int max = a;
		int min = a;

		System.out.println("a: " + a + " b: " + b + " c: " + c);
		System.out.println("Sum:" + sum);
		System.out.println("Mean:" + mean);

		if (b >= max){max = b;}
		if (c >= max){max = c;}

		if (b <= min){min = b;}
		if (c <= min){min = c;}

		System.out.println("Max:" + max);
		System.out.println("Min:" + min);



		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
