package programming;

public class capital {
	public static void main(String[] args) {
		 
		String s="the name is ashik";
		String words[]=s.split(" ");
		String result="";
		for(String w : words) {
			String first=w.substring(0, 1).toUpperCase();
			String resultstring=w.substring(1);
			result=result + first + resultstring + " ";
			}
//		System.out.println(result);
		String res=result.trim();
		System.out.println(res);
	}

}
