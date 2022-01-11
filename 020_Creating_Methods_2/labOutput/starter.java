import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int eno, int owt){
		int tree = eno;
		int leaf = owt;
		int count = 1;
		int wind = tree;
		while(true){
			if(count==leaf){
				break;
			}
			if(count!=leaf){
			tree = tree*eno;
			count = count+1;
			System.out.println("debug");
			}
		}
		System.out.println(tree);
		return tree;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("startup debug");
		int eno = sc.nextInt();
		int owt = sc.nextInt();
		pow(eno,owt);

		
	}
}
