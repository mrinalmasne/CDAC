package Day13;
interface A{
	void f1();
	void f3();
}
interface B{
	void f2();
	void f3();
}
abstract class Test{
	public abstract void f3();
}
class C extends Test implements A,B{
	@Override
	public void f1() {
		System.out.println("C.f1");
	}
	public void f2() {
		System.out.println("C.f2");
	}
	public void f3() {
		System.out.println("C.f3");
	}
}
public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A a=new C();
	a.f1();
	a.f3();
	B b=new C();
	b.f2();
	b.f3();
	C c=new C();
	c.f1();
	c.f2();
	c.f3();

	}

}
