package RegexModule;
import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistration {	
	
	public void nameValidation() {
		Scanner sc = new Scanner(System.in);		
		final String textRegexValidation = "(^[A-Z][a-z]{2,})";
		System.out.print("Enter the FirstName and LastName to validate : ");
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        
        boolean resultForFirstName = Pattern.matches(textRegexValidation, firstName);
        boolean resultForLastName = Pattern.matches(textRegexValidation, lastName);
        
        if (resultForFirstName && resultForLastName) {
            System.out.println("First Name is valid and acceptable.");
        }
        else if(!resultForFirstName) {
            System.out.println("Enter valid First Name");
            nameValidation();
        }
        else if(!resultForLastName) {
            System.out.println("Enter valid First Name");
            nameValidation();
        }
	}	

}
