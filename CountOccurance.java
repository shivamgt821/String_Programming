public class CountOccurance {

	public static void main(String[] args) {
		
		String s1 = "Occurance";
		
	  while(s1.length()>0) {
		s1=s1.toLowerCase();
		
		char ch = s1.charAt(0);
		String s2 = s1.replace(ch + "" , "");
		int count = s1.length()-s2.length();
		System.out.println(ch +"="+count);
		s1=s2;
		}
	}
}
