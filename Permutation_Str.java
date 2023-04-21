package com.jsp.Advancejava;

import java.util.Scanner;

public class Permutation_Str {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String s = sc.nextLine();
		System.out.println("The permutation of the String "+s+" is : ");
		permutation(s,0,s.length()-1);
	}
	public static void permutation(String s , int start, int end) {
		
		if(start == end) {
			System.out.println(s);
			return;
		}
		
		for(int i= start; i<=end; i++) {
			
			String s1 = swap(s, start,i);
//			System.out.println(s1);
			permutation(s1,start+1,end);
		}
	}
	public static String swap(String s, int i, int j) {
		
		char[] c = s.toCharArray();	// abc
		
		char t = c[i];
		c[i] = c[j];
		c[j] = t;
		return new String(c); 
	}
}
