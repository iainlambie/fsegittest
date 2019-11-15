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
		firstName = value1;
		otherNames = value2;
		surname = value3;

	} // End of Constructor

	// Getters and setters will go here in pairs
	public void setfirstname(String avalue)
	{
		firstName = avalue;
	}

	public String getfirstname()
	{
		return firstname;
	}

	public void setotherNames(String avalue)
	{
			otherNames = avalue;
	}

	public String otherfirstnames()
	{
			return othernames;
	}

	public void setsurname(String avalue)
	{
			suraame = avalue;
	}

	public String getsurname()
	{
			return surname;
	}

	// Mutator methods will go here
	public int getAge()
	{
		int age;

		// This method will caculate the age of a person
		// The attribute data of birth will be used along
		// with the current data. Age will be calculated
		// down to the nearest whole number of years
		age = 0;


		return age;

	} // End of getage

	public void printFullName()
	{
		String fullName;
		// This methid will return the full name of a person
		// in the order first firstName otherNames surname
		fullname = "";

		return fullName;

	} // End of printf full name

	public String toString()
	{
		return firstName + " " + otherNames + " " + surname;
	}

} // End of class declaration