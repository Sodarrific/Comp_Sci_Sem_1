import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	int randnum = rand.nextInt(1000);
	System.out.println("Would you like to play in hard or easy?");
	String diff = sc.nextLine();
	int finumb = sc.nextInt();
	while(finumb != randnum)
	{
		System.out.println("[INPUT A NUMBER]");
		int numb = sc.nextInt();
		if (numb>randnum){
			System.out.println("[HIGHER THAN NUMBER]");
		}
		if (numb<randnum){
			System.out.println("[LOWER THAN NUMBER]");
		}
		if (numb==randnum)
		{
			System.out.println("[CORRECT GAME OVER]");
			break;
		}
	}

		
	}
}
