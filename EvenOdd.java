package additon;



public class EvenOdd {

	public static void main(String[] args) {

		int array[]= new int[8];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		array[5]=6;
		array[6]=7;
		array[7]=8;

		int sum1=0;
		int sum2=0;		
		int countEven = 0;
		int countOdd= 0;

		for (int i= 0; i<array.length; i++) {


			if (array[i] %2 ==0) {


				countEven=countEven+1;

				sum1=sum1 + array[i];

			}

			else
			{

				sum2=sum2 +array[i];
				countOdd=countOdd+1;

			}

		}

		System.out.print("The even numbers are: ");
		for (int i= 0; i<array.length; i++) {
			if (array[i] %2 ==0) {
				System.out.print(array[i] + " ");
			}
		}


		System.out.print("\n");
		System.out.print("The odd numbers are: ");




		for (int i= 0; i<array.length; i++) {
			if (array[i] %2 !=0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.print("\n");
		System.out.println("The sum of even numbers is: "+ sum1);
		System.out.println("The sum of Odd numbers is: "+ sum2);
		System.out.println("There are " +countEven+ " even numbers in an array");
		System.out.println("There are " +countOdd+ " odd numbers in an array");

	}
}
