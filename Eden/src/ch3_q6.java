import java.util.Scanner;
public class ch3_q6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int scheduledKm; 
		int restingBeat;
		int trainingWeeks;
		System.out.println("How many weeks have you been training?");
		trainingWeeks=s.nextInt();
		s.nextLine();
		System.out.println("What is your heart's pulse rate at rest?");
		restingBeat=s.nextInt();
		s.nextLine();
		
		switch (trainingWeeks) {
		case 1:
		case 2:
			scheduledKm = 3;
			break;
		case 3:
		case 4:
			if(restingBeat<70)
				scheduledKm = 5;
			else
				scheduledKm = 3;
		break;
		default: 
			if(restingBeat<60)
				scheduledKm=10;
			else if(restingBeat<=70 && restingBeat>=60)
				scheduledKm = 8;
			else
				scheduledKm = 3;
		}
		
		System.out.println("in your next training session you should run " + scheduledKm + " KMS");
	}

}
