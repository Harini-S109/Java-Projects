package emailapp;
import java.util.Scanner;

public class email {
	// Declare variables
	private String firstName;
	private String lastName;
	private String department;
	private String randEmail;
	
	Scanner in = new Scanner(System.in);
	
	//constructor
	public email() {
		this.firstName = setFname();
		this.lastName = setLname();
		System.out.println("Name: "+ this.firstName + " "+ this.lastName);
		
		this.department = setDepartment();
		System.out.println("Your department: "+ this.department);
		
		this.randEmail = setEmail();
		System.out.println("Your random generated: "+ this.randEmail);
	}
	
	//ask name
	public String setFname() {
		System.out.println("Enter your first name: ");
		return in.nextLine().toUpperCase();
	}
	public String setLname() {
		System.out.println("Enter your last name: ");
		return in.nextLine().toUpperCase();
	}
	
	//set department 
	public String setDepartment() {
		System.out.println("Enter the department: \n1 for Sales \n2 for Development \n3 for Accounting \nSelect a number: ");
		int dept = in.nextInt();
		if(dept == 1) {
			return "Sales";
		}
		else if(dept == 2) {
			return "Dev";
		}
		else if(dept == 3) {
			return "Acc";
		}
		else {
			return "Enter a valid department";
		}
	}
	
	// set email
	public String setEmail() {
		int rand = (int) (Math.random() * 900);
		String em = this.firstName.toLowerCase() + this.lastName.toLowerCase() + this.department.toLowerCase() + rand + "@mail.com";
		return em;
	}
}

