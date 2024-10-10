package Assignment2;

import java.util.Scanner;

public class ReverseNumber {
	static int revNum(int n,int temp) {
		if(n==0)
			return temp;
		temp=temp*10+n%10;
		return revNum(n/10,temp);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=revNum(n,0);
		System.out.println(rev);
	}

}
