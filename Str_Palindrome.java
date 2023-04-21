package com.jsp.Advancejava;

public class Str_Palindrome {

	public static void main(String[] args) {
		String s1 = "madam";
		if(isPalindrome(s1)) {
			System.out.println(s1+" is Palindrome");
		}
		else {
			System.out.println(s1+" is Not a palindrome");
		}
		}
		static boolean isPalindrome(String s) {
			char[] c = s.toCharArray();
			int i=0; 
			int j=s.length()-1;
			while(j>=0) {
				if(c[i]!=c[j])  return false;
				i++;
				j--;
			}
			return true;
	}
}
