package Day2;

import java.util.Scanner;

public class MissingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int z[]=new int[size+1];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) 
			z[a[i]-1]=1;
		for(int i=0;i<a.length;i++) {
		if(z[i]!=1)
			System.out.println(i+1);
		}
		}

	}


