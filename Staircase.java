package programming;

import java.util.Scanner;

public class Staircase {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the size of the staircase: ");
	int n=s.nextInt();
    
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
		if(i+j>=n-1) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
	  }
		System.out.println();
	 }
	}

}

//OUTPUT
//#
//##
//###
//####
//#####
//######
