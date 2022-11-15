package additon;
public class SmallestandLargestNumber{
public static void main(String[] args) {
	
int aray[]= {-106,2,96,3,-236,-71};
int smallest=0;
int largest=0;
for(int i = 0; i<aray.length; i++) {

	
	if (aray[i] < smallest){

smallest=aray[i];
	}

else
	if(aray[i]>largest) {
		largest=aray[i];
	}
}
	System.out.println(smallest);	
	System.out.println(largest);
}
}


	
		