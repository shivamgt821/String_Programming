package SACUMEN;

public class FirstAndLastLetterSwap {

	public static void main(String[] args) {
		String s = "I am in Bangalore";
		String temp = "";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')count++;
		}
		String arr[]=new String[count+1];
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(ch1!=' ')temp+=ch1;
			else {
				arr[index++]=temp;
			temp="";
		}
		}
		arr[index]=temp;
		String temp2="";
		for(int i=0;i<arr.length;i++)
		{
			temp2+=swap(arr[i])+" ";
		}
		System.out.println(temp2);
	}
	public static String swap(String s)
	{
		char ch[]=s.toCharArray();
		int i=0,j=ch.length-1;
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}
}

		
		
		
