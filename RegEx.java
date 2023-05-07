import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		int count = 0;
//		Pattern p = Pattern.compile("[ab]");
//		Pattern p = Pattern.compile("ab");  // start with index and end with length
//		Matcher m = p.matcher("abcdbagh");
		
//		Pattern p = Pattern.compile("a[0-9]");
//		Matcher m = p.matcher("a4bcaba9ogh");
		
//		Pattern p = Pattern.compile("[0-9][0-9]");
//		Matcher m = p.matcher("ab23cd89456");
		
//		Pattern p = Pattern.compile("ab*");
//		Matcher m = p.matcher("ab23cabbd8abbb945abbbb6");
		
//		Pattern p = Pattern.compile("a1*b");
//		Matcher m = p.matcher("ab23ca1bbd8a11bbb945a12bbbb6");  // a12b not count because its format is wrong a1 2 is not possible

//		Pattern p = Pattern.compile("a.*");				// taking all character after a and give iteration 1
//		Matcher m = p.matcher("ab23cabbd8abbb945abbbb6");
		
		Pattern p = Pattern.compile("a[0-9]*b");
		Matcher m = p.matcher("ab23ca8bbd8a0bbb945abbbb6");
		
		while(m.find()) {
			
			count++;
			System.out.println("start = "+m.start());
			System.out.println("end = "+m.end());
			System.out.println("group = "+m.group());
			System.out.println("----------------------");
		}
		System.out.println("The number of iteration is "+count);
	}

}
