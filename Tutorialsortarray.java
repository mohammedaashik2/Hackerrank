package programming;
import java.util.Scanner;

public class Tutorialsortarray {
	  static Scanner s = new Scanner(System.in);
	    public static void main(String[] args) {

	        int V = s.nextInt();
	        int n = s.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }

	        int result = introTutorial(V, arr);
	        System.out.println(result);
	    }
	        static int introTutorial(int V, int[] arr) {
		     
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == V) {
		                return i;
		            }
		        }
		       
		        return -1;
		    }
	    
	}

//Sample Input 0
//
//STDIN           Function
//-----           --------
//4               V = 4
//6               arr[] size n = 6 (not passed, see function description parameters)
//1 4 5 7 9 12    arr = [1, 4, 5, 7, 9, 12]
//Sample Output 0
//
//1
//	



