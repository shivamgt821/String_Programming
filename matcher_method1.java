import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class matcher_method1 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[0-9]{3}");  // {3}--> show how much characher do you have ?
		Matcher m = p.matcher("123");  // highest 999 ,if you give {4} then highest 9999
		System.out.println(m.matches());
		System.out.println(m.find());
		
	}

}
