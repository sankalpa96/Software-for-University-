import java.util.Scanner;
public class Level4 {

	public  void Level4Controls() {
		
		System.out.println("WELCOME TO LEVEL 4");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		
		int count=0;// no of fail modules
		int total=0;
		int totalAvg=0;
		
		
		for(int i=1;i<=6;i++){
			
			System.out.println("Input module "+i+" marks \n");//module 1 marks calculation
		
		System.out.print(" ICT 1-"); //input ict 01 marks 
		int ict1=sc.nextInt();
		while(ict1<0 || ict1>100){
			System.err.println(" please Input marks between 0 and 100 \n");
			System.out.print(" ICT 1-"); // wrong input 
			 ict1=sc.nextInt();
		}
		
		System.out.print(" ICT 2-");
		int ict2=sc.nextInt();
		while(ict2<0 || ict2>100){
			System.err.println(" please Input marks between 0 and 100 \n");
			System.out.print(" ICT 2-"); // wrong input 
			 ict2=sc.nextInt();
		}
		
		System.out.print(" ICT 3-");
		int ict3=sc.nextInt();
		while(ict3<0 || ict3>100){
			System.err.println(" please Input marks between 0 and 100 \n");
			System.out.print(" ICT 3-"); // wrong input 
			 ict3=sc.nextInt();
		}
		
		int M_avg=(ict1+ict2+ict3)/3; //calculating module 1 average
		
		if(M_avg >40){
			System.out.println("                pass \n");
			
		}else{
			System.out.println("                fail \n");
			
			count++;
		}
		total+=M_avg;
		
		}
		
		totalAvg=total/6;
		
		if(count==0){
			System.out.println("You have pass all modules \n");
			Level5 l5=new Level5();
			l5.Level5Ccontrols();
			
			
		}else if(count<=2 && totalAvg>30){
			System.out.println("You will recieve condoned marks \n");
			Level5 l5=new Level5();
			l5.Level5Ccontrols();
			
			
		}else if(count==3){
			System.out.println("You have failed 3 modules \n");
			Referral ref=new Referral();
			ref.ReferalControls();
		}else{
			System.out.println("\n Student has been excluded from the University \n");
			System.out.println("Do you want to enter new student mark (Y/N) \n");
			char x=sc.next().charAt(0);
			
			if(x=='y' || x=='Y'){

				Register Student=new Register();
				Student.registerControls();

			}else{
				System.out.println("*************Thank you****************");
			}
		}

		
	

	}

}
