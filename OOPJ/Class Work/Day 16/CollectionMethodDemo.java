package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethodDemo {
	public static void display(Collection<?> c) {
		for(Object o: c)
			System.out.println(o);
	}
public static void main(String[] args) {
	ArrayList<String> str1=new ArrayList<>();
	List<String> str2=new ArrayList<>();
	str1.add("Ramesh");
	str1.add("Ganesh");
	str1.add("Suresh");
	str1.add("Mahesh");
	
	str2.add("Sayali");
	str2.add("Vaishali");
	str2.add("Rupali");
	
	System.out.println("String 1 elements are:");
	display(str1);
	System.out.println();
	
	System.out.println("String 2 elements are:");
	display(str2);
	System.out.println();
	
	str2.addAll(str1);
	System.out.println("strList2 after strList2.addAll(strList1):");
	display(str2);
	System.out.println();
	
	str2.remove("Vaishali");
	System.out.println("After removing Vaishali:");
	display(str2);
	System.out.println();
	
	//removeAll() method
			str1.removeAll(str2);
			System.out.println(str1);
			
			//retainAll() method
			str1.retainAll(str2);
			System.out.println(str1);

			//contains()
			boolean retval = str1.contains("Mohit"); //will return true or false
			
//			//containsAll()
//			retval = str1.containsAll(str2);			//will return true or false
//			//Using toArray() and printing the array
//			System.out.println("Output of the strList2.toArray():");	
//			Object[] obarr = str2.toArray();
//			for(Object ob : obarr)
//			{
//				System.out.println(ob);
//			}
//	
}
}
