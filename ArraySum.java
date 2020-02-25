public class ArraySum {



	private int result;



	public int sumOfArray(Integer[] myArray, int i) {

		

	     if (i == 0) {  

	         result = 0;

	     }

	     else {

	    	 result = myArray[i-1] + sumOfArray(myArray,(i-1));

	     }

	     return result;}

	



	 public int fibonacci(int n) {

	

		 if ((n == 0) || (n == 1)) { 

	         return n; 

		 }

		 else {

			 return fibonacci(n- 1) + fibonacci(n - 2);

		 }

	 }
}