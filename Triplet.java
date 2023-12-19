package programming;

import java.util.Scanner;

public class Triplet {
	   
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array: ");
		int size = s.nextInt();		
		int[]a=new int[size];
		int[]b=new int[size];
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter the element in a["+i+"]");
			a[i]=s.nextInt();
		}
        for(int i=0;i<b.length;i++) {
			
			System.out.println("Enter the element in b["+i+"]");
			b[i]=s.nextInt();
		}
        
        System.out.println("************");
        
        for(int i=0;i<a.length;i++) {
        	System.out.println("a["+i+"]-"+a[i]);
        }
        System.out.println("***********");
        for(int i=0;i<b.length;i++) {
        	System.out.println("b["+i+"]-"+b[i]);
        }
        
        int[] res=sum(a,b);
        System.out.println(res[0]+" "+res[1]);
        
	}
	
	public static int[] sum(int[]a,int[]b) {
		int alicescore=0;
		int bobscore=0;
		
     for (int m=0,n=0;m<a.length || n<a.length;m++,n++) {
        	
    	 if(a[m]>b[n]) {
    		 alicescore++;
   	    }else if(a[m]<b[m]){
   	    	 bobscore++;
   	   }
     }
     System.out.println("*****************");
     return new int[] {alicescore,bobscore} ;
   }
	
}

//Sample Input 0
//
//5 6 7
//3 6 10
//Sample Output 0
//
//1 1