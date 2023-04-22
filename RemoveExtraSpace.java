public class RemoveExtraSpace {

	public static void main(String args[]) {
		String str = " Java   is  an object   oreinted programming  language ";
		System.out.println(str.replaceAll("\\s+"," " ).trim());
	}
}
