package Assignment1;

import java.util.Scanner;

public class RepCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count[]=new int[256];
		for(char c :s.toCharArray()) {
			count[c]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>1)
				System.out.print(" "+(char)i);
				}
}
}
