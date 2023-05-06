import java.util.Scanner;

public class NextAlphabet 
	{
	   public static void main(String[] args) 
	   {
		   Scanner scn = new Scanner(System.in);

	       System.out.print("Enter a letter: ");
	       
	       char letter = scn.next().charAt(0);

	       char nextLetter = (char)(letter + 1);
	       System.out.println("The next letter is " + nextLetter);
	    }
}
