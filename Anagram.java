package programming;

	import java.util.Scanner;

	public class Anagram {

	    public static int anagram(String s) {
	        // Check if the length of the string is even
	        if (s.length() % 2 != 0) {
	            return -1;  // If the length is odd, it's not possible to split into two equal substrings
	        }

	        // Split the string into two substrings
	        int mid = s.length() / 2;
	        String s1 = s.substring(0, mid);
	        String s2 = s.substring(mid);

	        // Count the occurrences of each character in both substrings
	        int[] countS1 = new int[26];  // Assuming only lowercase English letters
	        int[] countS2 = new int[26];

	        for (char ch : s1.toCharArray()) {
	            countS1[ch - 'a']++;
	        }

	        for (char ch : s2.toCharArray()) {
	            countS2[ch - 'a']++;
	        }

	        // Calculate the number of changes needed to make the two substrings anagrams
	        int changes = 0;
	        for (int i = 0; i < 26; i++) {
	            changes += Math.abs(countS1[i] - countS2[i]);
	        }

	        // The minimum number of changes is half of the total changes
	        return changes / 2;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of test cases: ");
	        int q = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        for (int i = 0; i < q; i++) {
	            System.out.print("Enter the string: ");
	            String s = scanner.nextLine();
	            int result = anagram(s);
	            System.out.println(result);
	        }

	        scanner.close();
	    }
	}



