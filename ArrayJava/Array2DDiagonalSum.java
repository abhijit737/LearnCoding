
// not checked

import java.util.Scanner;

public class Array2DDiagonalSum 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int sum = 0;
        System.out.println("Enter the elements of the array:");
        	for (int i=0; i < n; i++) 
		{
            		for (int j=0; j < n; j++) 
	    		{
                		arr[i][j] = sc.nextInt();
                		if (i == j)
				 { // if the current element is on the main diagonal
                    			sum += arr[i][j]; // add it to the sum
            			 }

		        }


	        }
        System.out.println("The sum of the diagonal elements is: " + sum);
        
    }
}


