import java.util.Scanner;

public class Circumference{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type the radius: ");
		int num = Integer.parseInt(reader.nextLine());
		double eq = 2 * Math.PI * num; 
		System.out.println("Circumference of the circle: " + eq);
	}
}