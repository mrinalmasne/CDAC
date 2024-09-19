package Day15_1_7;

import java.util.Random;
import java.util.function.*;
//import java.util.function.Predicate;

public class Program7 {
	public static void main(String[] args) {
		Function<String ,Integer> fun=(String s)->s.length();
		int len=fun.apply("Mrinal");
		System.out.println(len);
	}
	public static void main3(String[] args) {
		//T get()
		Supplier<Integer> i=()->new Random().nextInt();
		int number=i.get();
		System.out.println(number);
		
		
	}
	
	public static void main2(String[] args) {
		Consumer<String> c=str->System.out.println(str);
		c.accept("Hello Mrinal");
		
	}
	public static void main1(String[] args) {
		Predicate<Integer>p=(Integer number)->number%2==0;
		int number=10;
		boolean result=p.test(number);
		System.out.println(result);
	}
}
