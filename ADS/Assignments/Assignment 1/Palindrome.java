package Assignment1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		if(n<0) {
			System.out.println(false);
			return;
		}
		while(n!=0) {
			sum=sum*10+n%10;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
