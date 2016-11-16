import java.util.Scanner;
public class ch1_q3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final double kmPrice = 5;
		final double floorPrice = 1;
		double furniturePrice;
		double furnitureWeight;
		double kmCustomer;
		double floorCustomer;
		double totalPrice;
		
		System.out.println("How much does the furniture cost in NIS?");
		furniturePrice =s.nextDouble();
		
		s.nextLine();
		System.out.println("How much does the furniture weigh in Kilograms?");
		furnitureWeight =s.nextDouble();
		
		s.nextLine();
		System.out.println("How many km do you need to transport your purchase?");
		kmCustomer =s.nextDouble();
		
		s.nextLine();
		System.out.println("How many floors are there in your complex?");
		floorCustomer =s.nextDouble();
		
		s.nextLine();
		
		totalPrice = furniturePrice*1.1+kmCustomer*kmPrice+floorCustomer*floorPrice*furnitureWeight;
		
		System.out.println("The total price of your purchase including transport and tip is " + totalPrice + " NIS.");
	}

}
