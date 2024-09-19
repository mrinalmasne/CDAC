package Day15_3_2;

public class Program1 {
public static void main(String[] args) {
	Class<?> c=Thread.class;
	String subClassName=c.getSimpleName();
	Class<?> superclass=c.getSuperclass();
	String superClassName=superclass.getSimpleName();
	Package pckg=c.getPackage();
	System.out.println("Package Name:"+pckg);
	System.out.println("Super Class:"+superClassName);
	System.out.println("Sub Class:"+subClassName);
}
}
