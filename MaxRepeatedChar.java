public class MaxRepeatedChar {

	public static void main(String[] args) {
		String s1 = "Engineering";
		char c = ' ';
		int count = 0;
		
		while(s1.length()>0) {
			char c1 = s1.charAt(0);
			String s2 = s1.replace(c1+"","");
			int len = s1.length()-s2.length();
			
			if(count<len) {
				count = len;
			    c = s1.charAt(0);
			}
			s1=s2;
			
		}
		System.out.println(c);
	}

}
