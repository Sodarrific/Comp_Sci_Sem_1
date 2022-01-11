import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number."); 
		int numberone = sc.nextInt();
		System.out.println("Please input another number."); 
		int numbertwo = sc.nextInt();
		if(numberone == numbertwo)
		{
			System.out.println("The two numbers are of the same value.");
		}
		if(numberone < numbertwo)
		{
			System.out.print(numberone);
			System.out.print(" is less than ");
			System.out.println(numbertwo);
		}
		if(numberone > numbertwo)
		{
			System.out.print(numberone);
			System.out.print(" is more than ");
			System.out.println(numbertwo);
		}
	}
}
