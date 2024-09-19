package Day15_1_4;
@FunctionalInterface
interface Printable{
	void print();
}
public class Program4 {
	public static void main(String args[]) {
		Printable p=()->System.out.println("Hello from lambda expression");
		p.print();
	}
}
