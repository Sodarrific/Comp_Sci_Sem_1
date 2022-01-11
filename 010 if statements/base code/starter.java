import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number that I was thinking from 1 through 10"); 
		int guess = sc.nextInt();
		if(guess == 7)
		{
			System.out.println("Correct!");
		}
		if(guess < 7)
		{
			System.out.println("Too low!");
		}
		if(guess > 7)
		{
			System.out.println("Too high!");
		}
		if(guess < 1)
		{
			System.out.println("1 through 10, not 0 through -10");
		}
		if(guess > 10)
		{
			System.out.println("You're not tryna shoot stars here.");
		}
	}
}
