import java.util.Scanner;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_10_digit_number {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any phone number : ");
		String phnNum = scn.next();
		
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(phnNum);
		
		if(m.matches()) 
			System.out.println("Valid number");
		
		else System.out.println("Invalid number");
	}

}
