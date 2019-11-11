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

} // End of class declaration