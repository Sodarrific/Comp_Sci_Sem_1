import java.util.Scanner;
import java.util.Random;

class starter {
	public static void Strung(String numbo){
		System.out.println(numbo);
		return;
	}
	public static void Stroong(String numbo,String numboo){
		System.out.print(numbo);
		System.out.print(" ");
		System.out.println(numboo);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		String numbo = sc.nextLine();
		String numboo = sc.nextLine();
		
		
		Strung(numbo);
		Stroong(numbo,numboo);
		
	}
}
