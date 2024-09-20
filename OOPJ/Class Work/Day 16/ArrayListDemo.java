package Day16;
import java.util.ArrayList;
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> str1=new ArrayList<>();
	str1.add("Ganesh");
	str1.add("Ramesh");
	str1.add("Mahesh");
	System.out.println("Elements are:");
	for(String s:str1) {
		System.out.println(s);
	}
}
}
