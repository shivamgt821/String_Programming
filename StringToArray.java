public class StringToArray {

	public static void main(String[] args) {
		String s = "I am in Banagalore";
		int space = 0;
		int index = 0;
		String temp = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c== ' ') space++;
		}
		String []a = new String[space+1];
		for(int j=0; j<s.length();j++) {
			char c1 = s.charAt(j);
			if(c1 != ' ') {
				temp=temp+c1;
			}
			else 
			{
				a[index++] = temp;
				temp = "";   // empty space again
			}
		}
		a[index] = temp;
		for(String n:a) System.out.println(n+" ");
		System.out.println(a.length);  // for checking purpose 
			}
}
