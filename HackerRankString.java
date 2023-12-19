package sorting;

import java.util.Scanner;

public class HackerRankString {
	       
	      static  Scanner sc = new Scanner(System.in);
	      public static void main(String[] args) {
       
          int q = sc.nextInt();
           for (int i = 0; i < q; i++) {
            String s = sc.next();
            System.out.println(hackerrankInString(s));
         }
	    }

	    static String hackerrankInString(String s) {
	        String target = "hackerrank";
	        int targetIndex = 0;

	        for (char ch : s.toCharArray()) {
	            if (targetIndex < target.length() && ch == target.charAt(targetIndex)){
	                targetIndex++;
	            }
	        }
//	        if(targetIndex == target.length()) {
//	        	return "YES";
//	        }else {
//	        	return "NO";
//	        }
	        return (targetIndex == target.length()) ? "YES" : "NO";
	    }

	  
	}
//Sample Input 1
//
//2
//hhaacckkekraraannk
//rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
//Sample Output 1
//
//YES
//NO
//
