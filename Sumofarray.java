package programming;

import java.util.Scanner;

public class Sumofarray {
	   static int sum=0;
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		
		int[]a=new int[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the Element in a["+i+"]");
			a[i]=s.nextInt();
		}
		System.out.println("************");
		
		for (int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]-"+a[i]);
		}
		
		int result = arraysum(a);
		System.out.println("The sum of the array is "+result);
		
	}
	
	public static int arraysum(int[] a) {
		
		for(int i=0; i<a.length;i++) {
			 
			sum+=a[i];
		}
		
		System.out.println("***********");
		
		return sum;
		
	}
	

}
//Sample Input
//
//6
//1 2 3 4 10 11
//Sample Output
//
//31
