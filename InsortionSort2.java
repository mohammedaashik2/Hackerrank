package sorting;

import java.util.Scanner;

public class InsortionSort2 {
	

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the array: ");
		int size = s.nextInt();
		int[] a = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the element in a[" + i + "]");
			a[i] = s.nextInt();
		}
		System.out.println("*********");
		
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) { 
				if (a[j - 1] > a[j]) {
					
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
			
				}
			}
			
			for (int index = 0; index < a.length; index++) {  
				System.out.print(a[index] + " ");
			}
			System.out.println();
		}
	}
}

	
//Sample Input
//
//5
//2 4 6 8 3
//Sample Output
//
//2 4 6 8 8 
//2 4 6 6 8 
//2 4 4 6 8 
//2 3 4 6 8 
//
//	
//
//
//
