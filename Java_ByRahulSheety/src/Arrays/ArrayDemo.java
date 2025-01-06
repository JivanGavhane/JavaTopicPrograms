package Arrays;

public class ArrayDemo {

	// Array is the collection of multiple values of similar data types
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int [5]; //Declared an array and allocates the memory for the array
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 20;
		a[4] = 25; //initilised the values into the array
		
		
		for(int i=0 ;i<a.length ; i++)
		{
			System.out.println(a[i]); //retrieve values present in the array
		}
	}

}
