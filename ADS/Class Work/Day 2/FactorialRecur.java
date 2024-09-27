package Day2;

public class FactorialRecur {
	static int factorial(int n) {
		if(n==0 || n==1)
			return n;
		else
			return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(factorial(6));
	}

}
