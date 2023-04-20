public class Word_Count { 


	public static void main(String[] args) {
		String s1 = " How Are  You Doing ";
		s1 = s1.trim();
		String [] s2 = s1.split(" +");
		
		System.out.println("The total words are : "+s2.length);
	}

}
  
