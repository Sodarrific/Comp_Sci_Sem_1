import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("[INPUT NAME]");
	String nam = sc.nextLine();
	System.out.println("[INPUT NUMBER]");
	int namb = sc.nextInt();
	int nom = 0;
	while(nom != namb)
	{
		System.out.print(nam);
		System.out.print(" ");
		if (nom == namb)
		{
			break;
		}
		nom = nom+1;
	}
	}
}
