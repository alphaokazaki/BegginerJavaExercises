import java.util.Scanner;

public class SumOfAges{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int age1;
		int age2;
		String name1;
		String name2;
		
		System.out.println("Type your name: ");
		name1 = reader.nextLine();
		System.out.println("Type your age: ");
		age1 = Integer.parseInt(reader.nextLine());
		System.out.println("Type your name: ");
		name2 = reader.nextLine();
		System.out.println("Type your age: ");
		age2 = Integer.parseInt(reader.nextLine());
		
		
		System.out.println(name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total.");
		
		
	}
}