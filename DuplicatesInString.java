package additon;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		String s[]= {"java", "plan", "java","anjum", "kal"," oracle", "api","plan"};

		for(int i=0; i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
				
				if( s[i]== s[j]) {
					System.out.println(s[i]);
				}
				
		}
	}
System.out.println("*********************HASHSET*************");


Set<String> dup= new HashSet<String>();
for (String e : s) {
	if(dup.add(e)==false) {
		System.out.println(e);
	}
}
}
}