import java.util.Scanner; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Str {

	public static void main(String[] args) {

		System.out.println("Enter Any Email : ");
		Scanner scn = new Scanner(System.in);
		String email = scn.next();
		String re = "[a-zA-Z]\\S*@[A-Za-z]+[.](com|ac\\.in|co\\.in|org\\.in)";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(email);
		if(m.matches())
		System.out.println("valid mail");
		else System.out.println("invalid mail");
			}
		}	


