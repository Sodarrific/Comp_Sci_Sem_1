import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int randnum = rand.nextInt(10)+0;
		System.out.println(randnum);
		int randnumb = rand.nextInt(100)+1;
		System.out.println(randnumb);
		double randnumbe = rand.nextDouble()+2.5;
		System.out.println(randnumbe);
		double randnumber = rand.nextDouble()+14;
		System.out.println(randnumber);
	}
}
