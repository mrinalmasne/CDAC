package Assignment2;
import java.util.Arrays;
import java.util.Scanner;
	

public class ArrayLeftRotation {
static int[] rotate(int a[],int d) {
	int n=a.length;
	d=d%n;
	int rotArray[]=new int[n];
	for(int i=0;i<n-d;i++) {
		rotArray[i]=a[d+i];
	}
	for(int i=0;i<d;i++) {
		rotArray[n-d+i]=a[i];
	}
	return rotArray;
}
	  
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int a[]= {1,2,3,4,5};
	    	int d=2;
	    	int res[]=rotate(a,d);
	    	System.out.println(Arrays.toString(res));
	    }
	}


