import java.util.Scanner;
public class String_Pattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s  = scn.nextLine();

	
		
		for(int i = 0; i<s.length() ; i++) {
			
			for(int j = 0 ;j<=i ; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

}
