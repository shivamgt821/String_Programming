import java.util.Scanner;

public class CountLengthWithountAnyBuiltIn {

	public static void main(String[] args) {
		
		String s = "Shivam is from jharkhand";
		Scanner scn = new Scanner(s); // Scanner is working as Constructor passing string inside parameter
		int count = 0;
		
		while(scn.hasNext()) {
			
			count++;
			scn.next();	
		}
		System.out.println(count);
	}
	

}
