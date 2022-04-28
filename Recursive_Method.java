package c2a3q3_2022_EthanEdwards;



public class ArraySum {

	public static int  FindSum (int[] arr, int n, int length, int left) {
	
	
	
	
	   
	    if(n == length)  // base case.
	    {
	    	return 0;
	    }
	    int temp = arr[n]; // temporary variable to hold current poisiton of the array

	    
	    
	   int right  = FindSum(arr,n+1, length, left +  arr[n]); // recursively call the findsum method the find the int that is moving to the right
	   if (n%2 == 0) {

	    	arr[n] = left + right;  // if the numbers are even, this variable calculates the current index with respect to the original numbers of the array and the sum of all the other elements.
	    	
	    
	    }
	     {
	     return temp + right; // final return, both the untouched array number, and the sum of the original array
	    }
	    
	    }
}

	

	    
	

	    
	





	



	


	    
	    	
	    

	    
	    
	   
	    
	    
	    

	


