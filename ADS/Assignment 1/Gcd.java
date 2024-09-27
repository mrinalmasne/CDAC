package Assignment1;

import java.util.Scanner;

public class Gcd {
	public static int gcd(int a,int b) {
		int diff=Math.abs(a-b);
		if(a>b)
			a=diff;
		else if(b>a)
			b=diff;
		else
			return a;
		return gcd(a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
        System.out.println(gcd(n1,n2));
	}

}
