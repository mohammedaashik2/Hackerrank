package sorting;
import java.util.Scanner;

public class DiagonalMatrix {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter one number that indicates the no of rows and columns: ");
        int n=s.nextInt();
        s.nextLine();
        int[][]arr=new int[n][n];
        
        for(int i=0;i<arr.length;i++) {
        	String[] values = s.nextLine().split(" ");
           for(int j=0;j<arr[i].length;j++) {
        	   arr[i][j]=Integer.parseInt(values[j]);
           }
        }
           int left_to_right=0;
           int right_to_left=0;
        
           for(int i=0;i<arr.length;i++) {
        	   left_to_right+=arr[i][i];
        	   right_to_left+=arr[i][arr.length-1-i];
           }
           int diff=Math.abs(left_to_right-right_to_left);
           System.out.println(diff);
        }
		
	}
                     

                     

//Sample Input
//
//3
//11 2 4
//4 5 6
//10 8 -12
//Sample Output
//
//15