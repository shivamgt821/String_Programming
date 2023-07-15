public class StringWithSwaoFirstAndLastChar2 {

	public static void main(String[] args) {
		String s = "I am in Bangalore";
		int spaces=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ') spaces++;
		}
		String [] a=new String [spaces+1];   // spaces+1 is used for know the how many word is used in sentences
		
		String temp="";
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp+=s.charAt(i);
			}
			if(s.charAt(i)==' '||i==s.length()-1)
			{
				a[index++]=StringWithSwaoFirstAndLastChar.swap(temp);
				temp="";    // we need to errays prev word and we need to attach the new word after the space
			}
			
		}
		for(String s1:a) {
			System.out.print(s1+" ");
		}
	}

}
