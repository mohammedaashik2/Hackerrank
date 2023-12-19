package programming;

import java.util.Scanner;

public class Correctness {
	
	    static Scanner s=new Scanner(System.in);
	    public static void main(String[] args) {
	        // System.out.println("Enter the size of the array: ");
	        int size=s.nextInt();
	        int[]a=new int[size];
	        
	        for(int i=0;i<a.length;i++) {
	            // System.out.println("Enter the element in a["+i+"]");
	            a[i]=s.nextInt();
	        }
	        // System.out.println("*********");
	        
	             int temp=0;
	        for(int i=0;i<a.length;i++) {
	            for(int j=0;j<a.length-i-1;j++) {
	                if(a[j]>a[j+1]) {
	                    temp=a[j];
	                    a[j]=a[j+1];
	                    a[j+1]=temp;
	                  }
	                
	         }
	            
	         }
	        for(int index=0;index<a.length;index++) {
	            System.out.print(a[index]+" ");
	          }
	    }

	}
//Sample Input
//
//6
//7 4 3 5 6 2
//Sample Output
//
//2 3 4 5 6 7
