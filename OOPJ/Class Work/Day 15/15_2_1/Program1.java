package Day15_2_1;
@FunctionalInterface
interface Printable{
	void print(String str);
}
public class Program1 {
	public static void showRecord(String str) {
		System.out.println(str);
	}
	public void displayRecord(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Program1 ref=new Program1();
		Printable p=ref::displayRecord;
		p.print("Hello Mrinal");
		
	}
	public static void main2(String[] args) {
		Printable p=Program1::showRecord;
		p.print("Hello Mrinal");
	}
	public static void main1(String[] args) {
		Printable p=str->System.out.println(str);
		p.print("Hello Mrinal");
	}
}
