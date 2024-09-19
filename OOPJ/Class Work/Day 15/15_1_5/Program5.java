package Day15_1_5;
@FunctionalInterface
interface Printable{
	void print(String str);
}
public class Program5 {
	public static void main(String[] args) {
		Printable p=(str)->System.out.println(str);
		p.print("Hello L.E.");
	}
	public static void main2(String[] args) {
		Printable p=(String s)->System.out.println(s);
		p.print("Hello L.E.");
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Printable p=str->System.out.println(str);
		p.print("Hello L.E.");
	}

}
