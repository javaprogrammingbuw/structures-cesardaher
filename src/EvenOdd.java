import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Please enter a value:");
		Scanner scan = new Scanner(System.in);

		int x = 0;
		int y = scan.nextInt();


		do{
			if (x % 2 == 0){
				x++;

			} else {
				System.out.println(x);
				x++;

			}

		}while(x <= y);


		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
