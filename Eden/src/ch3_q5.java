import java.util.Scanner;
public class ch3_q5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			boolean psycPass=false;
			int psycGrade;
			int psycEnglish;
			int psycMath;
			int bagrut;
			double totalGrade;
			boolean entryGranted=false;
			
			System.out.println("Please enter your psychometry grade\n");
			psycGrade=s.nextInt();
			s.nextLine();
			System.out.println("Please enter your psychometry english grade\n");
			psycEnglish=s.nextInt();
			s.nextLine();
			System.out.println("Please enter your psychometry math grade\n");
			psycMath=s.nextInt();
			s.nextLine();
			System.out.println("Please enter your bagrut grade\n");
			bagrut=s.nextInt();
			s.nextLine();
			
			if(psycGrade>=700 && psycEnglish>=120 && psycMath>=145)
				psycPass = true;
			
			totalGrade = (0.8*psycGrade)+(bagrut/1.2);
			
			if(bagrut>=102 || psycPass ==true || totalGrade>=600)
				entryGranted =true;
			
			System.out.println("you have" + (entryGranted==true ? "" : "n't") + " passed the minimum required notes to be accepted to the lilyput institute of higher gardening education.");
	}

}