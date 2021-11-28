package colections;

import java.util.Comparator;

public class Employee_Comparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getId()>o2.getId())
		return 1;
			
		else if (o1.getId()<o2.getId())
		return -1;
		else 
			return (o1.getName().compareTo(o2.getName()));
	}

}
