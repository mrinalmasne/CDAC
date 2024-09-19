package Day15_3_1;

import java.util.Date;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter F.Q.Class Name:");
			String className=sc.nextLine();
			Class<?> c= Class.forName(className);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
public static void main1(String[] args) {
	Date date=new Date();
	Class<?>c=date.getClass();
}
}
