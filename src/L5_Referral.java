import java.util.Scanner;

public class L5_Referral {
	
	public static int count;
	
		
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		L5_Referral.count = count;
	}
	
	
	public void L5_ReferralControls(){
	L5_Referral ref=new L5_Referral();
	ref.getCount();
	
	
	System.out.println("                   Input your Referral marks \n");
	
	Scanner sc=new Scanner(System.in);
	
	
	int refCount=0; // no of fail modules in referral
	int retCount=0; // no of fail modules in retake
	
	
	//referral marks calculation
	
	System.out.println("\n Student has failed "+count+" modules Please enter Referral marks \n");
	
	for(int i=1;i<=count;i++){
		System.out.println("Input Referral module "+i+" marks \n");//module 1 marks calculation
		
		System.out.print(" ICT 1-"); //input ict 01 marks 
		int ict1=sc.nextInt();
		while(ict1<0 || ict1>100){
			System.err.println(" please Input marks between 0 and 100");
			System.out.println();
			System.out.print(" ICT 1-"); // wrong input 
			 ict1=sc.nextInt();
		}
		
		System.out.print(" ICT 2-");
		int ict2=sc.nextInt();
		while(ict2<0 || ict2>100){
			System.err.println(" please Input marks between 0 and 100");
			System.out.println();
			System.out.print(" ICT 2-"); // wrong input 
			 ict2=sc.nextInt();
		}
		
		System.out.print(" ICT 3-");
		int ict3=sc.nextInt();
		while(ict3<0 || ict3>100){
			System.err.println(" please Input marks between 0 and 100");
			System.out.println();
			System.out.print(" ICT 3-"); // wrong input 
			 ict3=sc.nextInt();
		}
		
		double Ref_avg=(ict1+ict2+ict3)/3; //calculating module 1 average
		if(Ref_avg<40){
			refCount++; // no of fail modules 
		}
	}
	
	// Retake page

	if(refCount > 0){ 
		System.out.println("\n                    Please input your Retake Marks \n");
		
		
		
		for (int i=1;i<=refCount;i++){
			System.out.println("Input Retake module "+i+" marks \n");//module 1 marks calculation
			
			System.out.print(" ICT 1-"); //input ict 01 marks 
			int ict1=sc.nextInt();
			while(ict1<0 || ict1>100){
				System.err.println(" please Input marks between 0 and 100");
				System.out.println();
				System.out.print(" ICT 1-"); // wrong input 
				 ict1=sc.nextInt();
			}
			
			System.out.print(" ICT 2-");
			int ict2=sc.nextInt();
			while(ict2<0 || ict2>100){
				System.err.println(" please Input marks between 0 and 100");
				System.out.println();
				System.out.print(" ICT 2-"); // wrong input 
				 ict2=sc.nextInt();
			}
			
			System.out.print(" ICT 3-");
			int ict3=sc.nextInt();
			while(ict3<0 || ict3>100){
				System.err.println(" please Input marks between 0 and 100");
				System.out.println();
				System.out.print(" ICT 3-"); // wrong input 
				 ict3=sc.nextInt();
			}
			
			int Ref_avg=(ict1+ict2+ict3)/3; //calculating module 1 average
			if(Ref_avg<40){
				retCount++; // no of fail modules 
		
		}
	}
		
		// go to level 6
}/*else{
	Level6 l6=new Level6();
	l6.Leve6Controls();
}*/
	
	// Retake page
	
	if(retCount > 0){ 
		System.out.println("\n              Please input your Referral 2 Marks \n");
		
		
		int Ref_avg=0;
		for (int i=1;i<=retCount;i++){
			System.out.println("Input Referral 2 module "+i+" marks \n");//module 1 marks calculation
			
			System.out.print(" ICT 1-"); //input ict 01 marks 
			int ict1=sc.nextInt();
			while(ict1<0 || ict1>100){
				System.err.println(" please Input marks between 0 and 100");
				System.out.println();
				System.out.print(" ICT 1-"); // wrong input 
				 ict1=sc.nextInt();
			}
			
			System.out.print(" ICT 2-");
			int ict2=sc.nextInt();
			while(ict2<0 || ict2>100){
				System.err.println(" please Input marks between 0 and 100");
				System.out.println();
				System.out.print(" ICT 2-"); // wrong input 
				 ict2=sc.nextInt();
			}
			
			System.out.print(" ICT 3-");
			int ict3=sc.nextInt();
			while(ict3<0 || ict3>100){
				System.err.println(" please Input marks between 0 and 100");
				System.out.println();
				System.out.print(" ICT 3-"); // wrong input 
				 ict3=sc.nextInt();
			}
			
			 Ref_avg=(ict1+ict2+ict3)/3; //calculating module 1 average
			 
			 // exclution
			 char x=sc.next().charAt(0);
			if(Ref_avg<40){
			System.out.println("Student has got a Cert HE \n");
			System.out.println("Do you want to enter new student mark (Y/N) \n");
			if(x=='y' || x=='Y'){

				Register Student=new Register();
				Student.registerControls();

			}else{
				System.out.println("*************Thank you****************");
			}
			
		}
	}
		if(Ref_avg>40){
			Level6 l6=new Level6();
			l6.Leve6Controls();
			
		}
		
}else{
	Level6 l6=new Level6();
	l6.Leve6Controls();
}
	}

}
