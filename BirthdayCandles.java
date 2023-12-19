package programming;

import java.util.Scanner;

public class BirthdayCandles {
	
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
	public static void birthday(int[]a) {
		int candlescount=1;
		
		for(int i=0;i<a.length;i++){
			candlescount=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && a[i]!=-1) {
					candlescount++;
					a[j]=-1;
				}
			}
			if(candlescount>1) {
				 System.out.println("The count of birtday candles is "+candlescount);
		 }
		
		}
	}
}

