package RegexModule;
import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistration {		
	Scanner sc;
	
	public void nameValidation() {
		sc = new Scanner(System.in);		
		final String textPattern = "(^[A-Z][a-z]{2,})";
		System.out.print("Enter the FirstName and LastName to validate : ");
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        
        boolean resultForFirstName = Pattern.matches(textPattern, firstName);
        boolean resultForLastName = Pattern.matches(textPattern, lastName);
        
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
	
	public void eMailValidation () {
        sc = new Scanner(System.in);
        final String emailPattern = "[a-zA-Z1-9]+([.]xyz|)+@bl+[.]co([.]in|)";
        System.out.print("Enter email address to validate : ");
        String eMail = sc.nextLine();
        boolean resultForEmailValidation = Pattern.matches(emailPattern, eMail);
        if (resultForEmailValidation)
            System.out.println("Email ID is acceptable.");
        if (!resultForEmailValidation)
            System.out.println("Email ID is not acceptable.");
    }

}
