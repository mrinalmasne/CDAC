package Day2;

import java.util.Scanner;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int temp[]=new int[5];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++)
			if(a[i]==a[j]) {
				 flag=1;
				   System.out.print(a[i]+" ");
			}
			  
		}
		if(flag==0) 
			System.out.println(-1);
  
	}

}
