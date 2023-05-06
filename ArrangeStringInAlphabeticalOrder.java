public class ArrangeStringInAlphabeticalOrder {
	
		public static void main(String[] args) {
		String s = "apple";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1 - i; j++) {
				if (c[j] > c[j + 1]) {
					char temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for (char ch : c) {
			System.out.print(ch);
		}
	}
}
