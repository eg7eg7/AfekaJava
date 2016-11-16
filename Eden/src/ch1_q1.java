import java.util.Scanner;
import java.lang.Math;
public class ch1_q1 {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
			System.out.println("Please type in your desired radius in cm");
			double radius=s.nextDouble();
			System.out.println("\nThe circle's enclosed area is " + Math.PI*(radius*radius) + " and the circle's circumference is " + 2*Math.PI*radius);
	}

}
