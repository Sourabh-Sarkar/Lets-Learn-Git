package colections;

class Employee implements Comparable<Employee>{

private int id;
private String name;
private String address;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

@Override
public int compareTo(Employee that) {
	// TODO Auto-generated method stub
	return this.id-that.id;
}
@Override
public String toString() {
	return "Employee id=" + id + ", Name=" + name + ", Address=" + address + "]\n";
}
}