package Assignment2;

import java.util.Scanner;

public class StringPalindrome {
	static String strPalindrome(String s) {
		if(s.length()==0) 
			return s;
		return strPalindrome(s.substring(1))+s.charAt(0);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String temp=s;
		String pal=strPalindrome(s);
		boolean rev=(temp.equals(pal))? true:false;
		System.out.println(rev);
	}

}
