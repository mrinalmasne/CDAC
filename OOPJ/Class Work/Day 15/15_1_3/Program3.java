package Day15_1_3;


@FunctionalInterface
interface Printable{	//Printable.class
	void print( );
}

public class Program3 {	//Program.class
	public static void main(String[] args) {

		Printable p = new Printable() {	//Printable$1.class
			@Override
			public void print() {
				System.out.println("Hello from PrintableImpl");
			}
		};
		p.print();
	}
}
