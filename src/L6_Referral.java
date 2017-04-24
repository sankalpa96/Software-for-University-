import java.util.Scanner;

public class L6_Referral {
	
	public static int count1;
	
	
	


	public static int getCount1() {
		return count1;
	}





	public static void setCount1(int count1) {
		L6_Referral.count1 = count1;
		
	}



	public void L6_ReferralControls(){
		
		L6_Referral ref2=new L6_Referral();
		ref2.getCount1();
		
		
		System.out.println("                   Input your Referral marks \n");
		
		Scanner sc=new Scanner(System.in);
		
		
		int refCount=0; // no of fail modules in referral
		int retCount=0; // no of fail modules in retake
		
		
		//referral marks calculation
		
		System.out.println("\n Student has failed "+count1+" modules Please enter Referral marks \n");
		
		for(int i=1;i<=count1;i++){
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
					if(Ref_avg>40){
						Award award =new Award();
						award.AawardCalculation();
					}
			
			}
		}
			
			// go to level 6
	}
		
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
				System.out.println("Student has got a Dip HE \n");
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
				Award award =new Award();
				award.AawardCalculation();
				
			}
			
	}else{
		Award award =new Award();
		award.AawardCalculation();
	}
	}

}
