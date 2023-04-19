public class Panagram {

		public static void main(String[] args) {
		
			String s = "The quick brown fox jumps over the lazy dog";
			System.out.println(isPanagram(s));
	}
		static boolean isPanagram(String s1) {
			for(char c='a'; c<='z';c++) {
				if(s1.indexOf(c)==-1) return false;	
			}
			return true;
	}
}
