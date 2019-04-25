import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
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



		/*while (x % 2 == 0 && x < y){
			System.out.println(x);
			x++;
		

		}*/

		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
