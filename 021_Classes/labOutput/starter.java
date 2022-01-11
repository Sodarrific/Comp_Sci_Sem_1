import java.util.Scanner;
import java.util.Random;

class character{
	//Scanner sc = new Scanner(System.in);
	String Warrior = new String("Stats for the guy who fights or something");
	String Wizard = new String("ig stats for funny words magic man goes here");
	String Rogue = new String("sus edgy lolol");
	//String what = sc.nextLine();
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character Yes = new character();
		Scanner sc = new Scanner(System.in);
		String what = sc.nextLine();
		if(what.equals("Warrior")){
			System.out.println(Yes.Warrior);
		}
		if(what.equals("Wizard")){
			System.out.println(Yes.Wizard);
		}
		if(what.equals("Rogue")){
			System.out.println(Yes.Rogue);
		}
		
	}
}
