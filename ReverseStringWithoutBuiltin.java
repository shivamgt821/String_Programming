public class ReverseStringWithoutBuiltin {

	public static void main(String[] args) {
		String s1 = "Enginnering";
		String s2 = "";
		char[] arr = s1.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--) {
			s2 = s2+arr[i];
		}
		System.out.println(s2);
	}

}
