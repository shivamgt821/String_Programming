public class Count_Space_Str {
	
	static int spaceCount(String s) {
//		s.trim();
//		s.split(" + ");
		int count = 0;
		for(int i=0; i<s.length(); i++) 
		{
			if(s.charAt(i) == ' ') {
			count++;	
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s = "How Are You";
		 
		System.out.println(spaceCount(s));
	}
}
