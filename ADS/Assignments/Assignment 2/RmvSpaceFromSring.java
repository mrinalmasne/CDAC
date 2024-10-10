package Assignment2;

import java.util.Scanner;

public class RmvSpaceFromSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		for(char c:a) {
			if((c>='A' && c<='Z') ||(c>='a' && c<='z')) {
				System.out.print(c);
			}
		}
	}

}
