package Day2;

public class FibonacciRecur {
 static int fibo(int n) {
	 if(n<=1)
		 return n;
	return fibo(n-1)+fibo(n-2);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
		System.out.println(fibo(i)+" ");
		}
	}

}
