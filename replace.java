public class replace {

	public static void main(String[] args) {

		String s = "developer";
		System.out.println(s.replace('e', '@'));
		System.out.println(s.replace("lop", "LOP"));// same character and same string
		System.out.println(s.replace('e', ' '));	// same character and same string
		System.out.println(s.replace('e'+"", "")); // same character and same string
		System.out.println(s.replace("e"+ "", "")); // same character and same string
	
		String s1 = "   developer   ";
		System.out.println(s1);
		System.out.println(s1.trim());
	
	
	
	
	}

}
