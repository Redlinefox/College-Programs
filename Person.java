// Person.java
// Joy McQuillan
// updated Sept. 5, 2013
// March 1, 2012

// file for creating an object of type Person
// with instance variables:  name which is a String and age which is an int

public class Person
{
	// instance variables, each instance of a Person has this data
//	private String name;
//	private int age;
	
	protected String name;
	protected int age;
	
	// constructor with no arguments
	public Person()
	{
		name = "";
		age = -1;
	}
	
	// constructor with arguments
	public Person(String name, int a)
	{
		this.name = name; // when the instance variable name and the parameter variable name
                        // are the same, we need a way to distinguish between the two variables
                        // the ... this keyword ... specifies the variable which is associated
                        // with the object (instance variable)
		age = a;
	}
	
	// methods for getting the information, called "getters" or "accessors"
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	// methods for setting the information, called "setters" or "mutators"
	public void setName(String fName)
	{
		name = fName;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	// overriding the Object class' toString() method
   // used whenever a String representation of the object is needed
   // mostly used for debugging and testing ... to make sure the data in our object is as expected
	public String toString()
	{
		return "Name: " +name + " age: " + age;
	}

}