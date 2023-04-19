import java.util.Scanner;

public class Lower_UpperCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String to convert upper to lower case and vice versa: ");
		String s = sc.nextLine();
		String res = "";
		
		
		for(int i=0; i<s.length(); i++) {
			
			char c =s.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				
				res += (char)(s.charAt(i)+32);
			}
			else if(c >= 'a' && c <= 'z' ) {
				
//				if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					
					res += (char) (c - 32);
				}
			else res += c;
		}
		System.out.println(res);
	}

}
