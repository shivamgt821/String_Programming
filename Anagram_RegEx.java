public class Anagram_RegEx {
	
	public static void main(String[] args) 
	{
		System.out.println(anagram("silent" , "listen"));
	}
	
	static boolean anagram(String s1, String s2) {
		
		while(true) {
			if((s1.length()==0) && (s2.length()==0)) return true;
			if(s1.length()!=s2.length()) return false;	
			
			char ch = s1.charAt(0);
//			char ch1 = s2.charAt(0);  // may or may not use
			s1 = s1.replace(ch+ "", "");
			s2 = s2.replace(ch+ "", "");
			}
		}
	
}
