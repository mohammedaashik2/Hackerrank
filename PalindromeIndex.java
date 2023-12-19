package programming;

	import java.util.Scanner;

	public class PalindromeIndex {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int q = scanner.nextInt();

	        for (int i = 0; i < q; i++) {
	            String s = scanner.next();

	            System.out.println(palindromeIndex(s));
	        }

	        scanner.close();
	    }

	    static int palindromeIndex(String s) {
	        int left = 0;
	        int right = s.length() - 1;

	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                
	                if (isPalindrome(s, left + 1, right)) {
	                    return left;
	                } else if (isPalindrome(s, left, right - 1)) {
	                    return right;
	                } else {
	                    return -1;
	                }
	            }

	            left++;
	            right--;
	        }
	        return -1;
	    }

	    static boolean isPalindrome(String s, int start, int end) {
	        while (start < end) {
	            if (s.charAt(start) != s.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }
	}
//	Sample Input
//
//	STDIN   Function
//	-----   --------
//	3       q = 3
//	aaab    s = 'aaab' (first query)
//	baa     s = 'baa'  (second query)
//	aaa     s = 'aaa'  (third query)
//	Sample Output
//
//	3
//	0
//	-1
