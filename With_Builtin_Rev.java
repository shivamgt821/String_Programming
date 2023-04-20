public class With_Builtin_Rev {

	public static void main(String[] args) {
		String s1 = "java is an oop lang";// avaj si na poo gnal
		String s2 = "";
		String [] arr = s1.split(" ");
		
		for(String s:arr) {
			s2=s2+rev(s);
			s2=s2+" ";
		}
		s2=s2.trim();
		System.out.println(s2);
	}
	
	static String rev(String s) {
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}
}

