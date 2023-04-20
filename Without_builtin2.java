/* Without builtin print a string into reverse form  */

public class Without_builtin2 {

	public static void main(String[] args) {
		String s1 = "java is an oop lang";   // o/p : lang oop an is java
		String s2 = "";
		char c [] = s1.toCharArray();
		int i = c.length - 1;
		int j = c.length - 1;
		
		while(j>=0) {
			
		while(j>=0 && c[j] != ' ') {
			j--;
		}
		
		String t = "";
		int k = j+1;
		while(k<=i) {
			t = t+c[k];
			k++;
		}
		s2 = s2+t;
		if(j>=0) s2+=" ";
			j--;
			i = j;	
		}
		System.out.println(s2);
	
	}
	
}
