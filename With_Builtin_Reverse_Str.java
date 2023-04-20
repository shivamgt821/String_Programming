public class With_Builtin_Reverse_Str {

	public static void main(String[] args) {

		String s1 = "Java is an oop lang";
		String arr[] = s1.split(" ");
		String s2 = "";
		
		for(int i=arr.length-1;i>=0;i--) {
			s2 = s2+arr[i];
			s2 = s2+" ";
		}
		s2 = s2.trim();
		System.out.println(s2);
	}

}
