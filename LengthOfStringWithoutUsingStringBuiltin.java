package Signiwis;

public class LengthOfStringWithoutUsingStringBuiltin {

	public static void main(String[] args) {
		String s1 = "Enginnering";
		char c[] = s1.toCharArray();
		int count = 0;
		
		for(int n:c) {
			count++;
		}
		System.out.println("Length of String = "+count);
		
		// With built in
		System.out.println(s1.length());
	}

}
