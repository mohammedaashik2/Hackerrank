package programming;

import java.util.Scanner;

public class StrongPassword {
	        
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter your password: ");
		String userpassword=s.next();
		
		int missingpassword= missingcount(userpassword);
		
		System.out.println( missingpassword);
	}
//	
//     public static int missingcount(String userpassword) {
//    	 int missingsum=0;
//    	 String numbers = "0123456789";
//			String lower_case = "abcdefghijklmnopqrstuvwxyz";
//			String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//			String special_characters = "!@#$%^&*()-+";
//    	 for(int i=0;i<userpassword.length();i++) {
//    	 if(numbers.contains(userpassword.substring(0, 0+1))) {
//    		 missingsum=0;
//    	  }
//    	 
//    	 }
//    	for(int j=0;j<userpassword.length();j++) {
//        	 if(lower_case.contains(userpassword.substring(0, 0+1))) {
//        		   missingsum=0;
//        	  }
//         }
//    	
//    	 for(int x=0;x<userpassword.length();x++) {
//        	 if(upper_case.contains(userpassword.substring(0, 0+1))) {
//        		   missingsum=0;
//        	 }
//         }
//    	 
//    	 for(int y=0;y<userpassword.length();y++) {
//        	 if(special_characters.contains(userpassword.substring(0, 0+1))) {
//        		   missingsum=0;
//        	 }
//         }
//    	 
//    	 if(userpassword!=numbers) {
//    		   
//    	 }
//    	 
//    	return missingsum;
//     }
	
	public static int missingcount(String userpassword) {
		int missingsum=0;
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		if(!numbers.contains(userpassword)) {
			missingsum++;
		}else {
			missingsum=0;
		}
		if(!lower_case.contains(userpassword)) {
			missingsum++;
		}else {
			missingsum=0;
		}
		if(!upper_case.contains(userpassword)) {
			missingsum++;
		}else {
			missingsum=0;
		}
		if(!special_characters.contains(userpassword)) {
			missingsum++;
		}else {
			missingsum=0;
		}
		return missingsum;
   }
	 
 
}

//Sample Input 1
//
//11
//#HackerRank
//Sample Output 1
//
//1
    	
