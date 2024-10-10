package Assignment2;

import java.util.Scanner;

public class ArrayUniqueLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int newlen=1;
		for(int i=1;i<n;i++) {
			if(a[i]!=a[i-1]) {
				a[newlen]=a[i];
				newlen++;
			}
		}
		System.out.println(newlen);
		
		}

	}


