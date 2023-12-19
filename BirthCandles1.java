package programming;

import java.util.Scanner;

public class BirthCandles1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array: ");
		int size=s.nextInt();
		int[]a=new int[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element in a["+i+"]");
			a[i]=s.nextInt();
		}
		System.out.println("*********");
		
		birthday(a);
	}
	
	public static void birthday(int []a) {
		int maxheight=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxheight) {
				maxheight=a[i];
			}
		}
		
	    int candlescount=0;
	    for(int count : a) {
	    	if(count == maxheight) {
	    		candlescount++;
	    	}
	    }
	    
	    System.out.println(candlescount);
	}
}
//Sample Input 0
//
//4
//3 2 1 3
//Sample Output 0
//
//2
