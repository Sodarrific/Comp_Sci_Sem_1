import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		String Wizard = new String("Wizard");
		String Warrior = new String("Warrior");
		String Rogue = new String("Rogue");
		String SUS = new String("SUS");
		String Pickle = new String("Pickle");
		System.out.println("Would you like to be a Warrior, Wizard or Rogue?"); 
		String charc = sc.nextLine();
		if(charc.equals(Warrior)){
			System.out.println("You are warrior man lol");
		}
		else if(charc.equals(Wizard)){
			System.out.println("You are magic man lol");
		}
		else if(charc.equals(Rogue)){
			System.out.println("u eggy finch");
		}
		else if(charc.equals(SUS)){
			System.out.println("very");
		}
		else if(charc.equals(Pickle)){
			System.out.println("funniest crap i've ever seen");
		}
		else{
			System.out.println("not sicc");
		}
	}
}
