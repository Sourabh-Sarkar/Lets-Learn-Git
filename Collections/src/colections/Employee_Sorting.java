package colections;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_Sorting {

	public static void main (String args [])
	{
	ArrayList<Employee> al = new ArrayList<>();
	Employee e1=new Employee(1,"Sourabh","10 G");
	Employee e2=new Employee(5,"Raju","13 G");
	Employee e3=new Employee(5,"Raja","13 G");
	Employee e4=new Employee(5,"Annie","13 G");
	Employee e5=new Employee(3,"Kate","10 F");
	Employee e6=new Employee(100,"Drew","10 G");
	Employee e7=new Employee(35,"Brian","13 G");
	Employee e8=new Employee(-1,"Mathew","10 F");
	
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	al.add(e6);
	al.add(e7);
	al.add(e8);
	
	// Comparable
	Collections.sort(al);
	for(Employee e:al)
	System.out.print(e.toString());
	System.out.println("*********");
	
	//Comparator
	Collections.sort(al, new Employee_Comparator());
	for(Employee e:al)
		System.out.print(e.toString());
	    System.out.println("*********");
	//Comparator Lamda
	Collections.sort(al,(o1,o2)->
	{
		 if(o1.getAddress().compareTo(o2.getAddress())==0)
			 return (o1.getName().compareTo(o2.getName()));
		return o1.getAddress().compareTo(o2.getAddress());
					 
	}	
	);
	for(Employee e:al)
		System.out.print(e.toString());
	
}
}