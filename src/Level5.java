import java.util.Scanner;

public class Level5 {
	
	public void Level5Ccontrols(){
		System.out.println("\n         WELCOME TO LEVEL 5  \n");
		
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		
		int count=0;// no of fail modules
		double L5_total=0;
		double L5_totalAvg=0;
		double L5_min=100;
		
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
		
		double M_avg=(ict1+ict2+ict3)/3.0; //calculating module 1 average
		
		if(L5_min>M_avg)
			L5_min=M_avg;
		if(L5_min<40)
			L5_min=40;
		
		Award l5min=new Award();
		l5min.setL5_min(L5_min);
		
		
		
		if(M_avg >40){
			System.out.println("                pass \n");
			L5_total+=M_avg;
			
		}else{
			System.out.println("                fail \n");
			L5_total+=40;
			count++;
		}
		
		
		}
		
		L5_totalAvg=L5_total;
		Award L5avg=new Award();
		L5avg.setL5_totalAvg(L5_totalAvg);
		
		
		if(count==0){
			System.out.println("You have pass all modules \n");
			Level6 l6=new Level6();
			l6.Leve6Controls();
			
			
		
			
		}else if(count>0 && count<=3){
			System.out.println("You have failed "+count+" modules \n");
			L5_Referral ref=new L5_Referral();
			ref.setCount(count);
			ref.L5_ReferralControls();
			
		}else{
			System.out.println("\n Student has got a Cert HE \n");
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
