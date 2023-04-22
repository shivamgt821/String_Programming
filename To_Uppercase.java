import java.util.Scanner;

public class To_Uppercase {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scn.nextLine();
		
		String res = "";
		for(int i = 0; i<s.length() ; i++) {
			
			if(s.charAt(i)>= 'a' && s.charAt(i)<= 'z' ) {
				
//			if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				
				res += (char) (s.charAt(i) - 32);
			}
			else res += s.charAt(i);
		}
		System.out.println("The Uppercase of Given Satring is : "+ res);
	}

}
