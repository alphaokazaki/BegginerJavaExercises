import java.util.Scanner;

public class Divider{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.println("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		System.out.println();
		double eq = (double)num1 / (double)num2;
		System.out.println("Division: " + num1 + " / " + num2 + " = " + eq);
		
	}
}