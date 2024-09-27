package Assignment1;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,3);
            n=n/10;
        }
        if(sum==temp)
            System.out.println("true");
        else
            System.out.println("false");

	}

}
