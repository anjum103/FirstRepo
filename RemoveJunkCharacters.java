package additon;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
	String s = "*************@@@ %%%  metadata @@@";
  //reular expression
    s= s.replaceAll( "[^a-z0-9A-Z]", "");
    System.out.println(s);
	
	

	}

}
