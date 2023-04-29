public class EveryFirstLetterInCapitalInSentence {

	public static void main(String[] args) {
		String s1 = "java Is an oops language";   
		String s2 = "";
		String a[] = s1.split(" ");
		
		for(int i=0;i<a.length;i++) {
			String s=a[i];
			String es="";
			int k=0;
			if(s.charAt(k)>='a' && s.charAt(k)<='z') {
				es+=(char)(s.charAt(k)-32);
			}
			else es+=s.charAt(k);
			for(int j=1;j<s.length();j++) {
				es+=s.charAt(j);
			}
			System.out.print(es+" ");
		}
	}
}
