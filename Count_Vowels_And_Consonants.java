public class Count_Vowels_And_Consonants {

	public static void main(String[] args) {
		String s = "SHIVAM";
		int vowelCount = 0;
		int consCount = 0;
		
		for(int i=0; i<s.length()-1; i++) {
			
			s = s.toLowerCase();
			char c  = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowelCount++;
			}
			else consCount++;
		}
		System.out.println("Total Vowel = "+vowelCount+" Total Consonant = "+consCount);
	}

}
