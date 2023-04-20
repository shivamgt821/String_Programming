import java.util.Scanner;

public class Str_Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = sc.nextLine();
		
		String res = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			res += s.charAt(i);
			
		}
		System.out.println("The reverse String is :"+res);
	}

}
