import java.util.Scanner;

public class Referral {
	
	public void ReferalControls(){
		System.out.println("                   Input your Referral marks \n");
		
		Scanner sc=new Scanner(System.in);
		int count=0;// no of fail modules in referral
		int retCount=0; // no of fail modules in retake
		
		for(int i=1;i<=3;i++){
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
			
			int Ref_avg=(ict1+ict2+ict3)/3; //calculating module 1 average
			if(Ref_avg<40){
				count++; // no of fail modules 
			}
		}

		if(count > 0){ // Retake page
			System.out.println("\n                    Please input your Retake Marks \n");
			
			
			
			for (int i=1;i<=count;i++){
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
	}else{
		Level5 l5=new Level5();
		l5.Level5Ccontrols();
	}
		
		if(retCount > 0){ // Retake page
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
				}
				
				 Ref_avg=(ict1+ict2+ict3)/3; //calculating module 1 average
				if(Ref_avg<40){
				System.out.println("Student has been excluded from the University");
				
			}
		}
			if(Ref_avg>40){
				Level5 l5=new Level5();
				l5.Level5Ccontrols();
				
			}
			
	}else{
		Level5 l5=new Level5();
		l5.Level5Ccontrols();
	}

	}
}
