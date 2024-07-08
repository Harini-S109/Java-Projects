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
		
		this.randEmail = setREmail();
		System.out.println("Your random generated email: "+ this.randEmail);
		
		chooseOpt();
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
	
	// set random email
	public String setREmail() {
		int rand = (int) (Math.random() * 900);
		String em = this.firstName.toLowerCase() + this.lastName.toLowerCase() + this.department.toLowerCase() + rand + "@company.com";
		return em;
	}
	
	// set email
	public void setEmail() {
		System.out.println("Enter your desired name for email: ");
		String eml = in.nextLine();
		this.randEmail = eml.toLowerCase()+this.department.toLowerCase()+"@company.com";
	}
	
	//display data
	public void dispData() {
		System.out.println("Name: "+ this.firstName + " " + this.lastName);
		System.out.println("Department: "+ this.department);
		System.out.println("Email: "+ this.randEmail);
	}
	
	
	public void chooseOpt() {
		System.out.println("Choose: \n1 Change email \n2 Display data");
		int opt = in.nextInt();
		if(opt == 1) {
			setEmail();
		}
		else if(opt == 2) {
			dispData();
		}
		else {
			System.out.println("Enter a valid option.");
		}
	}
}

