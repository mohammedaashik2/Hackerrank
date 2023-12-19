package programming;
import java.util.*;

public class MaxMinSum {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();
		
		int[]a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element in a["+i+"]");
			a[i]=s.nextInt();
		}
		
		minmax(a);
	}
	public static void minmax(int[]a) {
		
		Arrays.sort(a);
		long min=0;
		long max=0;
		
		for(int i=0;i<a.length-1;i++) {
			   min+=a[i];
			}
		for(int i=1;i<a.length;i++) {
			   max+=a[i];
			}
		System.out.println(min+" "+max);
		
		
		}
	}

//Sample Input
//
//1 2 3 4 5
//Sample Output
//
//10 14
//	
//
//
