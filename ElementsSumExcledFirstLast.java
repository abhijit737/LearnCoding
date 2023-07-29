// not checked

class ElementsSumExcledFirstLast()
{
	public static int sumOfElementsExcludingFirstAndLast(int[] arr) 
	{
		int sum = 0;
		int length = arr.length;

		// Check if the length of the array is greater than 2
		if (length > 2) 
		{
			// Iterate over the array from index 1 to length-2 and add each element to sum
				for (int i = 1; i < length - 1; i++) 
			{
				sum += arr[i];
			}
		}	

		return sum;
	}
	int[] arr = {1, 2, 3, 4, 5};

	int sum = sumOfElementsExcludingFirstAndLast(arr);

	System.out.println(sum); // Prints 9, which is the sum of the elements excluding the first and last (2+3+4)

}


