import java.util.Scanner;

public class Adder{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number:");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.println("Type another number:");
		int num2 = Integer.parseInt(reader.nextLine());
		System.out.println();
		int sum = num1 + num2;
		System.out.println("Sum of the numbers: " + sum);
	}
}