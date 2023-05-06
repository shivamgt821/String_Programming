public class CheckPrimeOfLenOfString {

	public static void main(String[] args) {
		String s = "shivam";
		char[] c = s.toCharArray();
		int count = 0;
		for(int t:c) {
			count++;
		}
		System.out.println(prime(count));
		
	}
	public static boolean prime(int num) {
		
		if(num<=1) return false;
		for(int i = 2; i<=num/2 ; i++) if(num%i == 0) return false;				
		return true;
		}
}
