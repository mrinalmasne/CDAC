package Day2;

public class PalindromeRecur {
	static int palindrome(int n,int t) {
		if(n==0)
			return t;
		t=(t*10)+(n%10);
		return palindrome(n/10,t);
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int t=palindrome(n,0);
		if(t==n) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not");
	}

}
