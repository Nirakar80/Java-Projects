
/*This program asks the user for the phone-book entries with name
 *	   and phone-number and displays the information.
 * 
 * Nirakar
 * Assignment 7B
 * Question no 17 page 493 
 */
//Importing Scanner class orm utility package
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		
		//Declaring variables for the program.
		String NAME;
		long PHONE_NUMBER;
		int Entry;
		
		//Creating a new instance of Scanner.
		Scanner in = new Scanner(System.in);
		
		//Creating a new instance of PhoneBookEntry.
		PhoneBookEntry info = new PhoneBookEntry();
		
		//Asking user for the number of input.
		System.out.print("How many entries do you want to input? ");
		Entry = in.nextInt();
		
		/*Using for loop to prompt user for the name and phone number, and storing them 
		*		in the array of PhoneBookEntry class.
		*/
		for (int i = 0; i < Entry; i++)
		{

			System.out.print("Enter the name: ");
			NAME = in.nextLine();
						
			NAME = in.nextLine();
			info.setName(NAME);
			
			System.out.print("Enter the phone number: ");
			PHONE_NUMBER =in.nextLong();
			info.setPhoneNumber(PHONE_NUMBER);
			
		}
		
		//Displaying the stored data.
		System.out.println(" ");
		System.out.printf("    \tNAME\t\t\tPHONE NUMBER\n");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < Entry; i++)
		{
			System.out.printf("\t"+info.getName(i)+"\t\t\t "
					+ ""+ info.getPhoneNumber(i)+"\n");
		}

	}

}
