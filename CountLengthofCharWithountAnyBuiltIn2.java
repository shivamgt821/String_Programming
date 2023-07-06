import java.util.Scanner;

public class CountLengthofCharWithountAnyBuiltIn2 {
	
		public static void main(String[] args) {
			
			String s = "I am in bangalore";
			Scanner scn = new Scanner(s); // Scanner is working as constructor and passing string inside parameter
			int count=0;
			while(scn.hasNext()){
			
				count++;
				String s1=scn.next();
				Scanner sc=new Scanner(s1);
				sc.useDelimiter("");
				int c=0;
				while(sc.hasNext())
				{
					c++;
					sc.next();
				}
				System.out.print(c+""+s1+" ");
				
			}
			System.out.println();

			System.out.println(count);
		}
}
