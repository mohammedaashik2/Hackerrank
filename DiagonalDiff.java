package programming;

import java.util.Scanner;

public class DiagonalDiff {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the size of the staircase: ");
	int n=s.nextInt();
	int[]a=new int[n];
//	int[]b=new int[n];
//	int[]c=new int[n];
//	
//	for(int i=0;i<a.length;i++) {
//		System.out.println("Enter the Element in a["+i+"]");
//		a[i]=s.nextInt();
//		
//	}
//	System.out.println();
//	for(int i=0;i<b.length;i++) {
//		System.out.println("Enter the Element in b["+i+"]");
//		b[i]=s.nextInt();
//	}
//	System.out.println();
//	for(int i=0;i<c.length;i++) {
//		System.out.println("Enter the Element in c["+i+"]");
//		c[i]=s.nextInt();
//	}
//	
//	diagonal(a,b,c);
//    
//	
//	}
//	public static void diagonal(int[]a,int[]b,int[]c) {
//		   int sum=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<b.length;j++) {
//			if(i+j==a.length-1 || i==j) {
//				sum+=
//			}else {
//				System.out.print(" ");
//			}
//		  }
//			System.out.println();
//		 }
	
	  
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(i==0 || j==n-1 || j==0 || j==n/2 || i==n/2) {
//				System.out.print(s.nextInt());
//				for(int index=0;i<n;i++) {
//					System.out.println("Enter the element in a["+i+"]");
					a[j]=s.nextInt();
//				}
				
			}else{
				System.out.print(" ");
		  }
		 }
			System.out.println();
	 }
	}
}


