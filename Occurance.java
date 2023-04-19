import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {

		System.out.println("Enter a String : ");
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();// banana -->1b1a1n1a1n1a
							   // success -->1s1u2c1e2s
		s1= s1.toLowerCase();
		char [] a = s1.toCharArray();
		String s2 = "";
		int i = 0;
		
		while(i<a.length) {
			char c = a[i];
			i++;
			int count = 1;
			while(i<a.length && a[i] == c) {
				count++;
				i++;
			}
			s2 = s2+count+c;
		}
			System.out.println(s2);	
	}
}
