package RegexModule;
import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistration {	
	
	public void firstNameValidate() {
		Scanner sc = new Scanner(System.in);		
		final String regexFistName = "(^[A-Z][a-z]{3,})";
		System.out.print("Enter the FirstName to validate : ");
        String firstName = sc.nextLine();
        boolean resultForFirstName = Pattern.matches(regexFistName, firstName);
        if (resultForFirstName) {
            System.out.println("First Name is valid and acceptable.");
        }
        else {
            System.out.println("Enter valid First Name");
            firstNameValidate();
        }
	}	

}
