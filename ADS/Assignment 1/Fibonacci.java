package Assignment1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=0,f2=1;
		System.out.print("["+f1);
		int res=0;
		for(int i=1;i<n;i++) {
			f1=f2;
			f2=res;
			res=f1+f2;
			System.out.print(","+res);
		}
		System.out.println("]");
		

	}

}
