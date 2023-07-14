public class StringWithLength {

	public static void main(String[] args) {
		String s1 = "Java is an oop lang";
		String s2 = "";
		String arr[] = s1.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			s2 = s2+arr[i].length()+arr[i]+" ";
		}
		System.out.print(s2);
	}

}

