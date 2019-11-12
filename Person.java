/*
	Class Person is a superclass that
	will be used when building a class hierarchy
	of specific classes to model specifc "People"
	related beviour
*/

public class Person
{
	private String firstName;
	private String otherNames;
	private String surname;

	public Person()
	{
		firstName = "";
		othernames = "";
		surname = "";

	} // End of constructor

	public Person(String value1, String value2, String value3)
	{
		firstNames = value1;
		otherNames = value2;
		surname = value3;

	} // End of Constructor

	// Getters and setters will go here in pairs

	// Mutator methods will go here
	public int getAge()
	{
		int age;

		// This method will caculate the age of a person
		// The attribute data of birth will be used along
		// with the current data. Age will be calculated
		// down to the nearest whole number of years
		age = 0;


		// return age;
	}

} // End of class declaration