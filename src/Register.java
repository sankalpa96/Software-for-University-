import java.util.Scanner;

public class Register {
	
	public void registerControls(){
		
		Scanner sc=new Scanner(System.in);
		
  System.out.println("\n    WElcome  \n");
		
		
		System.out.print("Student name:");
		String studentName=sc.next();
		System.out.print("Student ID:");
		String stdentID=sc.next();
		System.out.println();
		
		Award Student=new Award();
		Student.setStudentName(studentName);
		Student.setStdentID(stdentID);
		
		
		Level4 L4=new Level4();
		L4.Level4Controls();
	
	}

}
