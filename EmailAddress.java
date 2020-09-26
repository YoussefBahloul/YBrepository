import java.util.Scanner;

public class EmailAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String firstName;
		String middleName;
		String lastName;
		String bday;
		
		System.out.println("What is your first name?");
		firstName = keyboard.nextLine();
		
		System.out.println("What is your middle name?");
		middleName = keyboard.nextLine();
		
		System.out.println("What is your last name?");
		lastName = keyboard.nextLine();
		
		System.out.println("What is your date of birth? (dd-mm-yyyy)");
		bday = keyboard.nextLine();
		
		String sharkMail = lastName.toLowerCase() + firstName.substring(0,1).toUpperCase() + middleName.substring(0,1).toUpperCase() + "@sharkmail.com"; 
		String tempPass = bday.substring(0,2) + bday.substring(3,5) + bday.substring(6,10); 		
				
		
		System.out.println("Your new Shark Mail address is: " + sharkMail);
		System.out.println("Your temporary password is: " + tempPass);
		System.out.print("*** This temporary password is very insecure. Please change it immediately!***");
		
		keyboard.close();
	
	}

}
