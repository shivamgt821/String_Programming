public class Compress_String_Occurance {

	public static void main(String[] args) {
		String s1 = "aaabbbcc";
		while(s1.length()>0) {
			char c = s1.charAt(0);
			String s2 = s1.replace(c +"","");
			int count = s1.length()-s2.length();
			System.out.print(c+""+count);
			s1 = s2;
		}
	}
}
