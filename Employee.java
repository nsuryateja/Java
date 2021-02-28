package dsjava;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int id;
	
	Employee(String firstName, String lastName, int id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getid()
	{
		return this.id;
	}
	public String toString() {
		
		return firstName + " " + lastName + " " + id;	
	}


}
