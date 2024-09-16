package Day14_2;



public class Program {
	public static void main(String[] args) {
		Date dt1 = new Date(16, 9, 2024);
		
		Date dt2 = dt1.clone();	
		dt2.setDay(23);
		dt2.setMonth(7);
		dt2.setYear(1983);
		
		System.out.println( dt1.toString());
		System.out.println( dt2.toString());
	}
	public static void main1(String[] args) {
		Date dt1=new Date(16,9,2024);
		Date dt2=dt1.clone();
		if( dt1 == dt2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
	}

}
