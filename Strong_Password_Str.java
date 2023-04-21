import java.util.Scanner ; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strong_Password_Str {

	public static void main(String[] args) {

		System.out.println("Enter any password : ");
		Scanner scn = new Scanner(System.in);
		String password = scn.next();
		String re = "(?=.*[@#$%^&*~!+_])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{6,10}";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(password);
		if(m.matches())
			System.out.println("valid password");
		else System.out.println("invalid password");
	}

}
