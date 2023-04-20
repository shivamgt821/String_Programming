/* Without builtin print a string into reverse form with order reverse also */

public class Without_Builtin {

	public static void main(String[] args) {

		String s1 = "java is an oop lang"; // avaj si na poo gnal
		String s2 = "";
		char [] c = s1.toCharArray();
		int i = 0, j = 0;
		
		while(j<c.length) {
		
			while(j < c.length && c[j]!= ' ') {
				j++;
			}
			String t = "";
			int k = j-1;
			while(k>=i) {
				t = t+c[k];
				k--;
			}
			s2 = s2+t;   // "avaj"
			
			if(j < c.length) {
				s2 += " " ;     // "avaj si " for space 
				}
				j++;
				i = j;
		}
		System.out.println(s2);
	}
}
