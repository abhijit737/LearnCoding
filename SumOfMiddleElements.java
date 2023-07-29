// not checked

class SumOfMiddleElements()
{
	
	int[] arr = {1, 2, 3, 4, 5};
	int sum = sumOfMiddleElements(arr);
	System.out.println(sum); // Prints 3, which is the sum of the middle elements (2 and 3)


	public static int sumOfMiddleElements(int[] arr) 
	{
		int sum = 0;
		int length = arr.length;

		// Check if the length of the array is odd or even
		if (length % 2 == 0) {
        // If even, sum the two middle elements
        sum = arr[length/2 - 1] + arr[length/2];
		} else {
        // If odd, sum the single middle element
        sum = arr[length/2];
		}

    return sum;
	}
	
	
	
	
}
