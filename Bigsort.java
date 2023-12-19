package programming;

import java.math.BigInteger;
import java.util.Scanner;

public class Bigsort {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();
	    BigInteger[]a=new BigInteger[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element in a["+i+"]");
			a[i]=new BigInteger(s.next());
		}
		
		BigInteger temp=BigInteger.ZERO;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("*************");
		
		for(int index=0;index<a.length;index++) {
			System.out.println(a[index]+"");
		}
		
		
		
	}

}
//Sample Input 1
//
//8
//1
//2
//100
//12303479849857341718340192371
//3084193741082937
//3084193741082938
//111
//200
//Sample Output 1
//
//1
//2
//100
//111
//200
//3084193741082937
//3084193741082938
//12303479849857341718340192371







