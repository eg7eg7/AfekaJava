import java.util.Scanner;
 class ch3_q4 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int age;
			int numberBooks;
			boolean canLoan;
			int lengthLoan=0;
			final int minorBooks = 3;
			final int majorBooks = 5;
			System.out.println("What's your age?");
			age = s.nextInt();
			s.nextLine();
			System.out.println("How many books do you have?");
			numberBooks = s.nextInt();
			if(numberBooks>0)
			{
				System.out.println("For how long do you have them in days?");
				lengthLoan = s.nextInt();
			}
			if(age>18)
			{
				if(numberBooks<=majorBooks)
				{
					if(lengthLoan<30)
						canLoan=true;
						else
						canLoan=false;
				}
				else
					canLoan=false;
			}
			else
			{
				if(numberBooks<=minorBooks)
				{
					if(lengthLoan<30)
						canLoan=true;
					else
						canLoan=false;
				}
				else
					canLoan=false;
			}
			if(canLoan)
				System.out.println("You can loan more books");
			else
				System.out.println("You can't loan any more books");
			
			
	}

}