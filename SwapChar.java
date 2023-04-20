public class SwapChar 
{

		public static void main(String[] args)
		{
			String s1 = "Engineering";
			char c[] = s1.toCharArray();
			int i=0; int j=c.length-1;
			
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			
			String s2 = new String(c);
			System.out.println(s2);

		}
}

