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
		System.out.println("Please input one last number."); 
		int numbertre = sc.nextInt();
		if(numberone < numbertwo){
			if(numberone < numbertre){
				System.out.print(numberone); 
				System.out.println(" is the lowest number"); 
			}
		}
		if(numbertwo < numberone){
			if(numbertwo < numbertre){
				System.out.print(numbertwo); 
				System.out.println(" is the lowest number"); 
			}
		}
		if(numbertre < numbertwo){
			if(numbertre < numberone){
				System.out.print(numbertre); 
				System.out.println(" is the lowest number"); 
			}
		}
		if(numberone > numbertwo){
			if(numberone > numbertre){
				System.out.print(numberone); 
				System.out.println(" is the highest number"); 
			}
		}
		if(numbertwo > numberone){
			if(numbertwo > numbertre){
				System.out.print(numbertwo); 
				System.out.println(" is the highest number"); 
			}
		}
		if(numbertre > numbertwo){
			if(numbertre > numberone){
				System.out.print(numbertre); 
				System.out.println(" is the highest number"); 
			}
		}
	}
}
