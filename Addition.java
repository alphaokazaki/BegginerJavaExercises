import java.util.Scanner;

public class Addition{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 5;
		int b = 4;
		int eq = a + b;
		System.out.println(a + " + " + b + " = " + eq);
		System.out.println("Now add your own numbers : (a + b =)");
		System.out.print("a: ");
		a = scan.nextInt();
		System.out.print("b: ");
		b = scan.nextInt();
		eq = a + b;
		System.out.println("Your equation is :" + "\n" + a + " + " + b + " = " + eq); 
	}
}