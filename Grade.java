package programming;

import java.util.Scanner;

public class Grade {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the no of Students : ");
		int students =s.nextInt();
		
		int[]grade=new int[students];
		
		for(int i=0;i<grade.length;i++) {
			
			System.out.println("Enter the student grade in grade["+i+"]");
			grade[i]=s.nextInt();
		}
		
		int[]roundedgrade = studentgrade(grade);
		
		for(int stdgrade : roundedgrade ) {
			
			System.out.println(stdgrade);
		}
		
		
	}
	
	public static int[] studentgrade(int[] grade) {
		  
		for(int i=0;i<grade.length;i++) {
			
		if(grade[i]>=38) {
			int roundinggrade = ((grade[i]+4)/5)*5;

		if(roundinggrade - grade[i]<3) {
			grade[i]= roundinggrade ;
		 }
		}
		 }
		
		return grade;
	}

}
//Sample Input 0
//
//4
//73
//67
//38
//33
//Sample Output 0
//
//75
//67
//40
//33