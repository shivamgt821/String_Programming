import java.util.Scanner;

public class Count_Character {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any String to count of any Character ");
		String s = scn.nextLine();
		System.out.println("Enter the character you want to count : ");
		char ch = scn.next().charAt(0);
		s = s.toLowerCase();

		int count = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(ch == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch+" is repeated in the String = "+count+" times");
	}

}
