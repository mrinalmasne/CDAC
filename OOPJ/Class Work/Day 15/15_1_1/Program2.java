package Day15_1_1;
interface Printable1{
	void print();
}
public class Program2 {
	public static void main(String args[]) {
		class PrintableImpl implements Printable1{
			@Override
			public void print() {
				System.out.println("Hello from PrintableImpl");
			}
		}
		Printable1 p=new PrintableImpl();
		p.print();
	}
}
