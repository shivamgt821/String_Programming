public class StringWithSwapFirstAndLastChar {

	public static void main(String[] args) {
		String s1 = "You Provide me Important Job";
		String []s2=s1.split(" ");
		String res="";
		
		for(int i=0;i<s2.length;i++)
		{
			res+=swap(s2[i])+" ";
			
		}
		System.out.println(res);
	}
	
	public static String swap(String s)
	{
		char c[] =s.toCharArray();
		
		char temp=c[0];
		c[0]=c[c.length-1];
		c[c.length-1]=temp;
		return new String(c);
	}
}
