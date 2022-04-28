package c2a3q3_2022_EthanEdwards;
import java.util.Arrays;
import java.util.Scanner;

public class c2a3q3_2022_EthanEdwards  {

	public static void main(String[] args) {
		
		// create array with 7 positions and call scanner
		int [] nums = new int [7];      
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Recursive program on 7 user inputs");
		// create a loop to get all the positions of the array. making sure to have while statements as checks that numbers are even and within range
		for (int i = 0; i<7; i++) {
			
		 System.out.println("Enter an even Integer in the range of 10 to 30 (inclusive): ");
		 
		 	
		 int num = in.nextInt();
		 
		 	while (num < 10 || num > 30) {
		 		System.out.println ("Invalid entry, number must be in range.");
		 		System.out.println("Enter an even Integer in the range of 10 to 30 (inclusive): ");
		 		num = in.nextInt();
		 	}
		 		
		 	while (num % 2 == 1) {
		 				System.out.println("Invalid entry, number must be even.");
		 				System.out.println("Enter an even Integer in the range of 10 to 30 (inclusive): ");
		 				num = in.nextInt();
		 				
		 		}
		 	// set the current index of the array to the correct input from the user
		 		nums[i] = num;
		 	
		 	}// final print statements and calling of the recursive function
		System.out.println("Original Array: " + Arrays.toString(nums));
		
		ArraySum.FindSum(nums, 0, nums.length, 0);
		// this statement now reprints the nums array after it has been modified by the findsum method
		System.out.println("Modified Array: " + Arrays.toString(nums));	
			
				// close the printer
					in.close();
					
				}
			
			
			

		  
	
		 	

				
		
			
		}

		
		
		
		

	


