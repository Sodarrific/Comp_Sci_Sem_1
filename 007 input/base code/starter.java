import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program
		Scanner sc = new Scanner(System.in);
		System.out.println("I is computer"); 
		System.out.println("Type anything to start.");
		String type = sc.nextLine();
		System.out.println("What is your [NAME_FIRST]"); 
		String name = sc.nextLine();
		System.out.println("What is your [AGE_YEARS]"); 
		String age = sc.nextLine();
		System.out.println("What is your [BIRTHDAY_MONTH]"); 
		String month = sc.nextLine();
		System.out.println("What is your [BIRTHDAY_DAY]"); 
		String day = sc.nextLine();
		System.out.println("What is your [BIRTHDAY_YEAR]"); 
		String year = sc.nextLine();
		System.out.println("How much is [ONE_DOLLAR_50_CENTS]"); 
		String moneyyy = sc.nextLine();
		System.out.println("[USER] answered"); 
		System.out.println("---------------"); 
		System.out.print(type); 
		System.out.println("[INPUT_START_1]"); 
		System.out.println("---------------"); 
		System.out.print(name); 
		System.out.println("[INPUT_NAME_2]");
		System.out.println("---------------"); 
		System.out.print(age); 
		System.out.println("[INPUT_AGE_3]");
		System.out.println("---------------"); 
		System.out.print(month); 
		System.out.println("[INPUT_MONTH_4]");
		System.out.println("---------------"); 
		System.out.print(day);
		System.out.println("[INPUT_DAY_5]");
		System.out.println("---------------"); 
		System.out.print(year); 
		System.out.println("[INPUT_YEAR_6]");
		System.out.println("---------------"); 
		System.out.print(moneyyy); 
		System.out.println("[INPUT_GREED_7]");
	}
}
