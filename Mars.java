package programming;


import java.util.Scanner;

public class Mars {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		String st=s.next();
		int count=1;
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
		
		if(i%3==0 && ch != 'S'|| i%3 ==1 && ch!='O' || i%3 ==2 && ch != 'S' ) {
			count++;
		}
	}
		System.out.println(count);
  }

}
//Sample Input 0
//
//SOSSPSSQSSOR
//Sample Output 0
//
//3
//
//Sample Input 1
//
//SOSSOT
//Sample Output 1
//
//1