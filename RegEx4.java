import java.util.regex.Matcher ; 
import java.util.regex.Pattern;

public class RegEx4 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("([a-z])\\1");
		Matcher m = p.matcher("success,taxx");
//		Pattern p = Pattern.compile("([a-z]+)\\1");
//		Matcher m = p.matcher("banana,taxx");
		while (m.find()) {
			System.out.println(m.group());    //  cc ss
		}
		System.out.println("done");
	}

}
