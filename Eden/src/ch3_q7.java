import java.util.Scanner;
public class ch3_q7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int examGrade;
		int averageExercise;
		int numberExercise;
		double finalGrade;
		boolean magen=false;
		System.out.println("Enter the grade of your exam:");
		examGrade = s.nextInt();
		s.nextLine();
		System.out.println("Enter the average grade of your exercises:");
		averageExercise = s.nextInt();
		s.nextLine();
		System.out.println("How many exercises did you hand over?");
		numberExercise = s.nextInt();
		s.nextLine();
		
		if(examGrade<averageExercise)
			magen=true;
		else
			magen=false;
		
		switch (numberExercise)
		{
		case 5:
		case 6:
			if (examGrade<=54)
				finalGrade=examGrade;
			else
				finalGrade=(0.2*averageExercise+0.8*examGrade);
			break;
		case 7:
		case 8:
			if(examGrade<=100 && examGrade>55)
			{
				if(magen)
					finalGrade=0.7*examGrade+0.3*averageExercise;
				else
					finalGrade=examGrade;
			}
			else
			{
				if(averageExercise>=80)
				{
					if(magen)
						finalGrade=0.75*examGrade+0.25*averageExercise;
					else
						finalGrade=examGrade;
						
				}
				else
				{
					if(magen)
						finalGrade=0.8*examGrade+0.2*averageExercise;
					else
						finalGrade=examGrade;
				}
			}
			break;
		default:
			finalGrade = 0;
			break;
		}
		
		System.out.println("Your final grade is " + finalGrade);
			System.out.println("\nyou " + (magen==true ? "had magen" : " didn't have magen") +" affect your total grade");
	}

}
