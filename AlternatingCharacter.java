package programming;
import java.util.Scanner;

public class AlternatingCharacter {
	       
	static Scanner s= new Scanner(System.in);
          public static void main(String[] args) {
	        System.out.println("Enter the character of num:");
           int c = s.nextInt();
	        for (int i = 0; i < c; i++) {
	            
	            String st = s.next();
	            System.out.println(mindeletion(st));
	            
	            }
      }  
  public static int mindeletion(String st) {
	        int deletions = 0;

	       
	        for (int i = 1; i < st.length(); i++) {
	            if (st.charAt(i) == st.charAt(i - 1)) {
	                deletions++;
	            }
	        }
          
	        return deletions;
	    }
	}


//Sample Input
//
//5
//AAAA
//BBBBB
//ABABABAB
//BABABA
//AAABBB
//Sample Output
//
//3
//4
//0
//0
//4
