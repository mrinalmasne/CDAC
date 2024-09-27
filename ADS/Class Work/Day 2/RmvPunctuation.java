package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class RmvPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if((a[i]>=97 && a[i]<=122) || a[i]==32)
				System.out.print(a[i]);
		}
		

	}

}
