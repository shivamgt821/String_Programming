import java.util.Scanner;

public class StringPalindromeWithoutBuiltin {

	public static void main(String[] args) {
		String s = "madam";
		Scanner scn = new Scanner(s); // Scanner is working as constructor and passing string inside parameter
		while(scn.hasNext()){
		
			String s1=scn.next();
			Scanner sc=new Scanner(s1);
			sc.useDelimiter("");
			int count=0;
			String temp = "";
			while(sc.hasNext())
			{
				count++;
				temp = sc.next()+temp;
			}
			if(temp.equals(s)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not palindrome");
			}	
	  }
	}
}
