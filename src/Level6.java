import java.util.Scanner;

public class Level6 {
	
	public void Leve6Controls(){
		System.out.println("\n          WELCOME TO LEVEL 6   \n");
		
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		
		int count1=0;// no of fail modules
		double L6_total=0;
		double L6_totalAvg=0;
		double L6_min=100;
		
		for(int i=1;i<=5;i++){
			
			System.out.println("Input module "+i+" marks \n");//module  marks calculation
		
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
		
		if(L6_min>M_avg)
			L6_min=M_avg;
		
		if(L6_min<40)
			L6_min=40;
		
		Award l6min=new Award();
		l6min.setL6_min(L6_min);
		
		
		
		if(M_avg >40){
			System.out.println("                pass \n");
			L6_total+=M_avg;
			
		}else{
			System.out.println("                fail \n");
			L6_total+=40;
			count1++;
			
		}
		
		
		}
		
		L6_totalAvg=L6_total;
		Award L6avg=new Award();
		L6avg.setL6_totalAvg(L6_totalAvg);
		
		
		if(count1==0){
			System.out.println("You have pass all modules \n");
			Award award=new Award();
			award.AawardCalculation();
			
			
		
			
		}else if(count1>0 && count1<=3){
			System.out.println("You have failed "+count1+" module \n");
			L6_Referral ref2=new L6_Referral();
			ref2.setCount1(count1);
			ref2.L6_ReferralControls();
			
		}else{
			System.out.println("\n Student has got a Dip HE \n");
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
