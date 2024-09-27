package Day2;

import java.util.Scanner;

public class InitialOfName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++) {
			
			if(a[i]==32) {
				System.out.println(a[i+1]);
			}
		}
	}

}
