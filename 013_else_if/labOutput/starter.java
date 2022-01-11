import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Guess numb between 1 and 1000"); 
		int reply = sc.nextInt();
		int rando = ran.nextInt(1001+1);
		if (reply == rando){
			System.out.println("Correct.");
		}
		if (reply < rando){
			System.out.print("Too Low. ");
			System.out.println(rando);
		}
		else if (reply > rando){
			System.out.print("Too High. ");
			System.out.println(rando);
		}
		if (reply > 1000){
			System.out.print("what ");
			System.out.println(rando);
		}
		if (reply < 1){
			System.out.print("bruh read");
			System.out.println(rando);
		}
		
	}
}