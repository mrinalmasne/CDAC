package Day12;
class Outer{
	private int num1=10;
	private static int num2=20;
	public Outer() {
}
	class Inner{
		private int num3=30;
		private static int num4=40;
	}
	public void printRecord() {
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+Outer.num2);
		Inner in=new Inner();
		System.out.println("Num3:"+in.num3);
		System.out.println("Num4:"+Inner.num4);
	}
	}
public class demo3 {
	public static void main(String[] args) {
	Outer out=new Outer();
	out.printRecord();
	}
}
