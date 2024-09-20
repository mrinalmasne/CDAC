package Day16;


import java.util.ArrayList;
import java.util.List;

class Student{
	int roll;
	String name;
	int age;
	public Student() {
		
	}
	public Student(int roll,String name,int age) {
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Roll No: "+roll+" Name: "+name+" Age: "+age;
	}
}
public class StudentListDemo {
public static void main(String[] args) {
	List<Student> list=new ArrayList<>();
	Student s1=new Student(1,"Aditya",22);
	Student s2=new Student(2,"Aditi",23);
	list.add(s1);
	list.add(s2);
	for(Student s:list) {
		System.out.println(s);
	//	System.out.println(s.toString());  Same O/P
	}
}
}
