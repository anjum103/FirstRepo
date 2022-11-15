package additon;

public class ReverseAString {

	public static void main(String[] args) {
		String d= "SHAIKH";

		int len=d.length();
String reverse="";
		for (int i= len-1; i>=0; i--) {

			reverse=reverse + d.charAt(i);
			
		}
		System.out.println(reverse);
	}
}
