package Day13;
interface Printable{
	int num=10;
	void print();
}
class PrintableImpl implements Printable{
	public void print() {
		System.out.println("Number:"+num);
	}
}
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintableImpl p=new PrintableImpl();
		p.print();
	}

}
