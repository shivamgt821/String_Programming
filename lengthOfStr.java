public class lengthOfStr {

	public static void main(String[] args) {
		String s= "Bangalore";
		char c[] = s.toCharArray();
		int count = 0;
		
		for(char n:c) {
			count++;
		}
		System.out.println(count);
	}

}
