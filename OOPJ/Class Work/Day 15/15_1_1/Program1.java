package Day15_1_1;
@FunctionalInterface
interface Printable{
	void print();
}
class PrintableImpl implements Printable {
	@Override
	public void print() {
		System.out.println("Hello from PrintableImpl");
	}
}

public class Program1{
	public static void main(String args[]) {
		Printable p=new PrintableImpl();
		p.print();
	}
}
