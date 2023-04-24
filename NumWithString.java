public class NumWithString {
//	static int len(String s) {
//		return s.length();
//	}
	public static void main(String[] args) {
		
		String s1 = "I Am In Bangalore";  // o/p--> 1I 2Am 2In 9Bangalore
		String[] s2 = s1.split(" ");
		String s3 = "";
		
		for(int i=0; i<s2.length; i++) {
			s3 = s3+(s2[i].length()+s2[i]);
//			s3 = s3+(s2[i]+s2[i].length());      // o/p--> I1 Am2 In2 Bangalore9
			s3 = s3+" ";
		}
		s3 = s3.trim();
		System.out.println(s3);
	}

}
