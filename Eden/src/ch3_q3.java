import java.util.Scanner;

public class ch3_q3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean family;
		boolean closeFriends;
		boolean longtimeFriend;
		boolean longDrive;
		int priceWedding=0;
		int years;
		int hours;
		System.out.println("for the following questions, 'true' means 'Yes', and 'False' means 'No'\n");
		System.out.println("Are you the Husband's or Bride's family member?");
		family = s.nextBoolean();
		System.out.println("Are you the Husband's or Bride's close friend?");
		closeFriends = s.nextBoolean();
		System.out.println("how many years do you know the husband or wife?");
		years=s.nextInt();
		s.nextLine();
		if(years > 3) {
			longtimeFriend = true;
		}
		else
		{
			longtimeFriend = false;
		}
		
		
		System.out.println("how many hours do you need to drive to the wedding?");
		hours=s.nextInt();
		s.nextLine();
			if(hours > 1) 
				longDrive = true;
			else
				longDrive = false;
			
			
			if(family)
				priceWedding = priceWedding+1000;
			else if (closeFriends)
			{
				priceWedding = priceWedding+500;
				if(longtimeFriend)
						priceWedding=priceWedding+50;
				if(longDrive)
						priceWedding=priceWedding-50;
			}
			else
			{
					priceWedding = priceWedding+250;
					if(longtimeFriend)
						priceWedding=priceWedding+50;
					if(longDrive)
						priceWedding=priceWedding-50;
			}
			System.out.println("You need to give to the newly wed couple " + priceWedding + "NIS");
	}
}
