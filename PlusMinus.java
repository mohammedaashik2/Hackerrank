package programming;

import java.util.Scanner;

public class PlusMinus {
	
	static Scanner s=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array :");
		int size =s.nextInt();
	    int []a=new int[size];
	    
	    for(int i=0;i<a.length;i++) {
	    	System.out.println("Enter the element in a a["+i+"]");
	    	a[i]=s.nextInt();
	    }
	    
	    plusminus(a);
	}
	
	public static void plusminus(int []a) {
		
		    int positivecount=0;
		    int negativecount=0;
		    int zerocount=0;
		for(int num : a) {
			if(num>0) {
				positivecount++;
			}else if(num<0) {
				negativecount++;
			}else {
				zerocount++;
			}
		}
        int totalcount=a.length;
	    
	    double positivevalue=(double)positivecount/totalcount;
	    double negativevalue=(double)negativecount/totalcount;
	    double zerovalue=(double)zerocount/totalcount;
	    
	    System.out.println("The positive numbers are :"+positivecount+" and The proportions of occurance is"+positivevalue);
	    System.out.println("The negative numbers are :"+negativecount+" and The proportions of occurance is"+negativevalue);
	    System.out.println("The negative numbers are :"+zerocount+" and The proportions of occurance is"+zerovalue);
	}
	
}
//Sample Input
//
//STDIN           Function
//-----           --------
//6               arr[] size n = 6
//-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
//Sample Output
//
//0.500000
//0.333333
//0.166667
