package additon;

public class SwapTwoVariables {

	public static void main(String[] args) {
		int x= 5;
		int y= 9;
		
		System.out.println("before swap x= "+x);
		System.out.println("before swap y= "+y);
		
		
		int temp=x;
		x=y;
		
		y=temp;
		
		
	System.out.println("***************************** after swap *************************************");
	System.out.println("x= "+ x);
	System.out.println("y= "+ y);
	
	
}
}