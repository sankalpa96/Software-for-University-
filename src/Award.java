
public class Award {
	
	public static double L5_totalAvg; // level 5 average
	public static double L6_totalAvg; //level 6 average
	public static double L5_min; // level 5 minimum
	public static double L6_min; // level 5 minimum
	public static String studentName; // name of the student 
	public static String stdentID; // student ID
	
	
	public static double getL5_totalAvg() {
		return L5_totalAvg;
	}

	public static double getL5_min() {
		return L5_min;
	}

	public static void setL5_min(double l5_min) {
		L5_min = l5_min;
	}

	public static double getL6_min() {
		return L6_min;
	}

	public static void setL6_min(double l6_min) {
		L6_min = l6_min;
	}

	public static void setL5_totalAvg(double l5_totalAvg) {
		L5_totalAvg = l5_totalAvg;
	}

	public static double getL6_totalAvg() {
		return L6_totalAvg;
	}

	public static void setL6_totalAvg(double l6_totalAvg) {
		L6_totalAvg = l6_totalAvg;
	}
	
	
	public void AawardCalculation(){
		
		Award Student=new Award();
		Student.getStudentName();
		Student.getStdentID();
		
		System.out.println("  Student Name:-"+studentName);
		System.out.println("  Student ID  :-"+stdentID);
		
		Award L5avg=new Award();
		L5avg.getL5_totalAvg();
		
		Award L6avg=new Award();
		L6avg.getL6_totalAvg();
		
		Award l5min=new Award();
		l5min.getL5_min();
		
		Award l6min=new Award();
		l6min.getL6_min();
		
		/*System.out.println(" l5 "+L5_totalAvg);
		System.out.println(" l6 "+L6_totalAvg);
		System.out.println(" l5 min is "+L5_min);
		System.out.println(" l6 min is "+L6_min);
		*/
		double L5_avg;
		double L6_avg;
		double avg;
		
		if (L5_min<L6_min){
			L5_avg=L5_totalAvg-L5_min;
			avg=((L5_avg/5)/3+((L6_totalAvg/5)/3)*2);
			
			
			if(avg>=70){
				System.out.println("\n 1ST Class Honours Degree \n");
				
			}else if(avg>=60){
				System.out.println("\n 2ND Class Honours Upper Division Degree \n");
				
			}else if(avg>=50){
				System.out.println("\n 2ND Class Honours Lower Division Degree \n");
				
			}else if(avg>=40){
				System.out.println("\n 3RD Class Honours  Degree \n");
			}
			
		}
		
		else if(L6_min<L5_min){
			L6_avg=L6_totalAvg-L6_min;
			avg=((L5_totalAvg/6)/3+((L6_avg/4)/3)*2);
			
			if(avg>=70){
				System.out.println("\n 1ST Class Honours Degree \n");
				
			}else if(avg>=60){
				System.out.println("\n 2ND Class Honours Upper Division Degree \n");
				
			}else if(avg>=50){
				System.out.println("\n 2ND Class Honours Lower Division Degree \n");
				
			}else if(avg>=40){
				System.out.println("\n 3RD Class Honours  Degree \n");
			}
		}else{
			L6_avg=L6_totalAvg-L6_min;
			avg=((L5_totalAvg/6)/3+((L6_avg/4)/3)*2);
			
			if(avg>=70){
				System.out.println("\n 1ST Class Honours Degree \n");
				
			}else if(avg>=60){
				System.out.println("\n 2ND Class Honours Upper Division Degree \n");
				
			}else if(avg>=50){
				System.out.println("\n 2ND Class Honours Lower Division Degree \n");
				
			}else if(avg>=40){
				System.out.println("\n 3RD Class Honours  Degree \n");
			}
			
		}
	}

	public static String getStudentName() {
		return studentName;
	}

	public static void setStudentName(String studentName) {
		Award.studentName = studentName;
	}

	public static String getStdentID() {
		return stdentID;
	}

	public static void setStdentID(String stdentID) {
		Award.stdentID = stdentID;
	}

}
