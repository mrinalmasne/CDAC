package Day13_2;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
	
}