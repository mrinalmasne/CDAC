package Day12;
class Outer1{
	private int num1=10;
	private static int num2=10;
	static class Inner{
		private int num3=30;
		private static int num4=40;
		
		public void printRecord() {
			Outer1 out=new Outer1();
			System.out.println("Num1:"+out.num1);
			System.out.println("Num2:"+num2);
			System.out.println("Num3:"+num3);
			System.out.println("Num4:"+Inner.num4);
		}
	}
}
public class demo8 {
public static void main(String[] args) {
	Outer1.Inner in=new Outer1.Inner();
	in.printRecord();
}
}
