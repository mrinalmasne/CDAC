package Day2;

public class NumSeriesRecur {
	static void  series(int n) {
		if(n<=0) 
			return;
		else {
			series(n-1);
			System.out.println(n);
		}
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		series(10);
	}

}
