import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		System.out.println("                UNIVERSITY OF GUGSI,no where in particular");
		System.out.println("Login \n");
		Scanner sc=new Scanner(System.in);
		
		// User validation
		
		System.out.print("Username:");
		String username=sc.next();
		System.out.print("Password:");
		String password=sc.next();
		
		while(!(username.equals("sankalpa"))|| !(password.equals("1234"))){
		
		System.err.println("Login Fail");
		System.out.println();
		System.out.print("Username:");
		username=sc.next();
		System.out.print("Password:");
		password=sc.next();
		
		}
		
		
		Register Student=new Register();
		Student.registerControls();

	}

}
