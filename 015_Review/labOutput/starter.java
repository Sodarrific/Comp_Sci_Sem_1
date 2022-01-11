import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("HELLO!");
		System.out.println("I UNDERSTAND THAT YOU ARE HERE BECAUSE YOU WANT TO BE A [salesman for vaccuums]?");
		String Fu = sc.nextLine();
		String no = new String("no");
		if(Fu.equals(no)){
			System.out.println("oh. ok then.");
		}
		System.out.println("[Enter your number, ID, password, usernamenamenamenamenamenamenamenamenamenamenamenamename]");
		System.out.println("[ENTER YOUR NAME]");
		String charc = sc.nextLine();
		System.out.println("EAHAHAHHH!!!");
		System.out.println("PERFECT!");
		System.out.println("SO YOU WANT TO BE A SALESMAN, YES?????!");
		System.out.println("[ENTER YOUR PROFESSION/TITLE]");
		String prof = sc.nextLine();
		System.out.println("ARE YOU [fat]?");
		System.out.println("########################");
		System.out.println("[UPGRADE SKILLS = Strength, Dexterity, Intelligence, Constitution, Charisma");
		System.out.println("[YOU HAVE 25 SKILL POINTS]");
		int Points = 25;
		System.out.println("[CURRENT CHOICE STRENGTH]");
		int Strength = sc.nextInt();
		int Points2 = (Points-Strength);
		if(Strength>Points){
						System.out.println("No. You have exceeded the current value. Rerun and dont play like a baby.");
		}
		System.out.print("[YOU NOW HAVE ");
		System.out.print(Points2);
		System.out.println(" SKILL POINTS]");
		if(Points2<=0){
			System.out.println("You're out of points.");
			System.out.print("[NAME] ");
			System.out.println(charc);
			System.out.print("[PROFESSION] ");
			System.out.println(prof);
			System.out.print("[STRENGTH] ");
			System.out.println(Strength);
			System.out.println("[DEXTERITY] 0");
			System.out.println("[INTELLIGENCE] 0");
			System.out.println("[CONSTITUTION] 0");
			System.out.println("[CHARISMA] 0");
		}
		else{
			System.out.println("[CURRENT CHOICE DEXTERITY]");
			int Dexterity = sc.nextInt();
			int Points3 = (Points2-Dexterity);
			if(Dexterity>Points2){
						System.out.println("No. You have exceeded the current value. Rerun and dont play like a baby.");
			}
			System.out.print("[YOU NOW HAVE ");
			System.out.print(Points3);
			System.out.println(" SKILL POINTS]");
			if(Points3<=0){
				System.out.println("You're out of points.");
				System.out.print("[NAME] ");
				System.out.println(charc);
				System.out.print("[PROFESSION] ");
				System.out.println(prof);
				System.out.print("[STRENGTH] ");
				System.out.println(Strength);
				System.out.print("[DEXTERITY] ");
				System.out.println(Dexterity);
				System.out.println("[INTELLIGENCE] 0");
				System.out.println("[CONSTITUTION] 0");
				System.out.println("[CHARISMA] 0");
			}
			else{
				System.out.println("[CURRENT CHOICE INTELLIGENCE]");
				int Intelligence = sc.nextInt();
				int Points4 = (Points3-Intelligence);
				if(Intelligence>Points3){
						System.out.println("No. You have exceeded the current value. Rerun and dont play like a baby.");
				}
				System.out.print("[YOU NOW HAVE ");
				System.out.print(Points4);
				System.out.println(" SKILL POINTS]");
				if(Points4<=0){
					System.out.println("You're out of points.");
					System.out.print("[NAME] ");
					System.out.println(charc);
					System.out.print("[PROFESSION] ");
					System.out.println(prof);
					System.out.print("[STRENGTH] ");
					System.out.println(Strength);
					System.out.print("[DEXTERITY] ");
					System.out.println(Dexterity);
					System.out.print("[INTELLIGENCE] ");
					System.out.println(Intelligence);
					System.out.println("[CONSTITUTION] 0");
					System.out.println("[CHARISMA] 0");
				}
				else{
					System.out.println("[CURRENT CHOICE CONSTITUTION]");
					int Constitution = sc.nextInt();
					int Points5 = (Points4-Constitution);
					if(Constitution>Points4){
						System.out.println("No. You have exceeded the current value. Rerun and dont play like a baby.");
					}
					System.out.print("[YOU NOW HAVE ");
					System.out.print(Points5);
					System.out.println(" SKILL POINTS]");
					if(Points5<=0){
						System.out.println("You're out of points.");
						System.out.print("[NAME] ");
						System.out.println(charc);
						System.out.print("[PROFESSION] ");
						System.out.println(prof);
						System.out.print("[STRENGTH] ");
						System.out.println(Strength);
						System.out.print("[DEXTERITY] ");
						System.out.println(Dexterity);
						System.out.print("[INTELLIGENCE] ");
						System.out.println(Intelligence);
						System.out.print("[CONSTITUTION] ");
						System.out.println(Constitution);
						System.out.print("[CHARISMA] 0");
					}
					else{
						System.out.println("[CURRENT CHOICE CHARISMA]");
						int Charisma = sc.nextInt();
						int Points6 = (Points5-Charisma);
						if(Charisma>Points5){
						System.out.println("No. You have exceeded the current value. Rerun and dont play like a baby.");
						}
						System.out.print("[YOU HAVE WASTED ");
						System.out.print(Points6);
						System.out.println(" SKILL POINTS]");
						System.out.println("[FINAL STATS]");
						System.out.print("[NAME] ");
						System.out.println(charc);
						System.out.print("[PROFESSION] ");
						System.out.println(prof);
						System.out.print("[STRENGTH] ");
						System.out.println(Strength);
						System.out.print("[DEXTERITY] ");
						System.out.println(Dexterity);
						System.out.print("[INTELLIGENCE] ");
						System.out.println(Intelligence);
						System.out.print("[CONSTITUTION] ");
						System.out.println(Constitution);
						System.out.print("[CHARISMA] ");
						System.out.println(Charisma);
						System.out.println("[Type anything to continue.] ");
						String randoo = sc.nextLine();
						System.out.println("PERFECT PERFECT PERFECT!!!!!");
						System.out.println("NOW YOU CAN GO OUT AND [Sell pineapples a cheap price]??");
						}
					}
				}
			}
		}
	}

