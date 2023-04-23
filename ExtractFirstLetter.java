public class ExtractFirstLetter {

	public static void main(String[] args) {
		String s = "Learn With Shivam Kumar";
		splitWords(s);
	}

	public static void splitWords(String s) {
		String words [] = s.split(" ");
		for(int i=0; i<words.length; i++) {
			String s1 = words[i];
			System.out.println(s1.charAt(0));
		}
	}
}
