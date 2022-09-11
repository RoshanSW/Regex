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
        
        if (resultForEmailValidation) {
            System.out.println("Email ID is acceptable.");
        }
        else{
            System.out.println("Email ID is not acceptable.");
            eMailValidation();
        }
    }
	
	public void phoneNumberValidation() {
        sc = new Scanner(System.in);
        final String phoneNumberPattern = "[0-9]{2}+(\\s)+[6-9][0-9]{9}";
        
        System.out.print("Enter Phone Number to validate : ");
        String phoneNumber = sc.nextLine();
        
        boolean resultForPhoneNumberValidation = Pattern.matches(phoneNumberPattern, phoneNumber);
        
        if (resultForPhoneNumberValidation)
            System.out.println("Phone Number is Valid");
        else
            System.out.println("Phone Number is Invalid");
	}


	public void passwordValidation() {
        sc = new Scanner(System.in);
        
        System.out.println("Password must contain minimun 8 char, one uppers case text and number ");
        final String passwordPattern = "(?=.*?[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
        
        System.out.print("Enter password to validate : ");
        String password = sc.nextLine();
        
        boolean resultForPasswordValidation = Pattern.matches(passwordPattern, password);
        if (resultForPasswordValidation)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
	}
}
