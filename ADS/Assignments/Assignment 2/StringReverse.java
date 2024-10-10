package Assignment2;

import java.util.Scanner;

public class StringReverse {
	static String reverse(String s) {
		if(s.length()==0) {
			return s;
		}
		return (s.substring(1))+s.charAt(0);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String rev=reverse(s);
	System.out.println(rev);
}
}
