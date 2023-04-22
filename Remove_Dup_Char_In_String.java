public class Remove_Dup_Char_In_String {

	public static void main(String[] args) {
		String s1="abbbccddffeeegg";
		
		String s2 = "";
		
		while(s1.length()>0){
			
			char c1 = s1.charAt(0);
			s1 = s1.replace(c1+"", "");
			s2 = s2+c1;
		}
		System.out.println(s2);
	}

}
