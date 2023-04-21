public class Permutation_String {

	public static void main(String[] args) {
		
			permutation("abcd",0,2);
	}
	
	public static void permutation(String s,int start,int end) {
		if(start == end) {
			System.out.println(s);
			return;
		}
		for(int i=start; i<=end; i++) {
			String s2 = swap(s, start, i);
			permutation(s2,start+1,end);
		}
	}
	
	static String swap(String s,int i, int j) {
		char[] c = s.toCharArray();
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		
		return new String(c);
	}

}
