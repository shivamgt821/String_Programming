import java.util.LinkedHashSet;  
import java.util.Scanner;

public class RemoveDupCharWithoutAnyStringBuiltIn {

	public static void main(String[] args) {
		String s = "missipissi";
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		Scanner scn = new Scanner(s);
		scn.useDelimiter("");
		while(scn.hasNext()) {
			String s2 = scn.next();
			set.add(s2);
		}
		System.out.println(set);
		
	}

}
