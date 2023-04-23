import java.util.Scanner;

public class RemoveSpaceBetweenString 
{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any String");
		String s = scn.nextLine();
		char arr[]= s.toCharArray();
		String res="";
		
		for(char c:arr) {
			if(c!=' ') {
				res+=c;
			}
		}
		System.out.println(res);
	}
}


