import java.util.Scanner;

public class To_Lowercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String to convert lower case : ");
		String s = sc.nextLine();
		
		String res = "";
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
			//if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				
				res += (char)(s.charAt(i)+32);
			}
			else res += s.charAt(i);
		}
		System.out.println("The lower case of the String is : "+res);
		
	}

}
