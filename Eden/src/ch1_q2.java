
import java.util.Scanner;
public class ch1_q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Toast = 12; //Toast Price
		int cheapExtras = 2; //Price of cheap toast extras
		int expExtras = 3; //price of expensive toast extras
		int totalPrice; //total price for the customer
		int numberCheap; //number of cheap extras the customer chose
		int numberExp; //number of expensive extras the customer chose
		
		System.out.println("Toast price is " + Toast + " NIS \nThe price of the cheap extras such as mushrooms, olives and corn is " + cheapExtras + " NIS\nThe Price of the expensive extras is such as bulgarian cheese, extra cheese and etc is " + expExtras + " NIS\n\n\nPlease Type in the number of cheap extras that you want to add to your toast -");
		numberCheap = s.nextInt();
		s.nextLine();
		
		System.out.println("\nType in the number of the expensive extras that you want on your toast-");
		numberExp = s.nextInt();
		s.nextLine();
		
		totalPrice=Toast+numberCheap*cheapExtras+numberExp*expExtras;
		
		System.out.println("\nThe price of your toast is " + totalPrice + " NIS");
	}

}
