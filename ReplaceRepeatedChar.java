public class ReplaceRepeatedChar {

	public static void main(String [] args) {
		String s = "APPLE";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					String replace = s.replace(s.charAt(j) + "", "$");
					System.out.println(replace);
				}
			}
		}
	}
}
