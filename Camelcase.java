package programming;

import java.util.Scanner;

public class Camelcase {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the setence: ");
		String word=s.next();
		int wordcount=1;

		for(int i=1;i<word.length();i++) {
			char c=word.charAt(i);
			if(Character.isUpperCase(c)) {
				wordcount++;
			}
		}
		System.out.println(wordcount);
		
	}
}

//Sample Input
//
//saveChangesInTheEditor
//Sample Output
//
//5
