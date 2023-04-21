class Book1 {
	String title;
	Book1(String t){
		this.title = t;
	}
	@Override
	public String toString() {
		return "Book[title = "+title+ "]";
	}
}
public class ToString {

	public static void main(String[] args) {
		
		Book1 b = new Book1("java");
		String S = b.toString();
		System.out.println(b);  // by default toString() method run
		System.out.println(S);
  }
}
