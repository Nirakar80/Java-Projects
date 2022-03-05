
 /* This program is for creating a PhoneBookEntry class to be used
 * 		in another program.
 * 
 * Nirakar
 * Assignment 7B
 * Question no 17 page 493
 */

//Importing ArrayList class from utility package
import java.util.ArrayList;

public class PhoneBookEntry 
{
	//Declaring the two arrays using function of ArrayList class. 
	private ArrayList<String> name = new ArrayList<String>();
	private ArrayList<Long> phoneNumber = new ArrayList<Long>();
	
	//Creating constructors for the class.
	public PhoneBookEntry()
	{
		
	}
		
	public PhoneBookEntry(String Name, long PN)
	{
		
	}

	//Creating accessor and mutator methods(getters and setters) of the class.
	public String getName(int i) 
	{
		return name.get(i);
	}

	public void setName(String Name)
	{
		name.add(Name);
	}

	public long getPhoneNumber(int i) 
	{
		return phoneNumber.get(i);
	}

	public void setPhoneNumber(long PN) 
	{
		phoneNumber.add(PN);
	}
}
	













