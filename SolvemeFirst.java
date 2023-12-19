package programming;
import java.util.Scanner;

public class SolvemeFirst {
	
	    static Scanner s=new Scanner(System.in);
	    public static void main(String[] args) {
	         System.out.println("Enter the a value:");
	        int a=s.nextInt();
	         System.out.println("Enter the b value:");
	        int b=s.nextInt();         
	        int result = sum(a,b);
	        System.out.println("The sum of the num is "+result);
	        
	        
	    }
	    
	    public static int sum(int a,int b){
	        int res=a+b;
	        return res;
	    }
	}

//Sample Input
//
//a = 2
//b = 3
//Sample Output
//
//5

