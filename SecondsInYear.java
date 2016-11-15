import java.util.Scanner;

public class SecondsInYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Find out how many seconds are in a year.");
		System.out.println("Insert number of years below: ");
		int Years = scan.nextInt();
		int Days = 365;
		int Hours = 24;
		int Minutes = 60;
		int Seconds = 60;
		int SecondsInAYear = Seconds * Minutes * Hours * Days * Years;
		System.out.println("There are " + SecondsInAYear + " in a year.");
	}
}