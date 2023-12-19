package programming;
import java.util.Scanner;

public class aVeryBigSum {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array: ");
		int size=s.nextInt();
		int[]a=new int[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element in a["+i+"]");
			a[i]=s.nextInt();
		}
		
		long res=bigsum(a);
		System.out.println(res);
	}
	
	public static long bigsum(int[]a) {
		
		long result=0;
		
		for(int i=0;i<a.length;i++) {
			result+=a[i];
		}
		System.out.println("***********");
		return result;
	}

}
//Sample Input
//
//5
//1000000001 1000000002 1000000003 1000000004 1000000005
//Output
//
//5000000015
