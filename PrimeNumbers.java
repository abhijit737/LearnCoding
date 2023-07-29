public class PrimeNumbers {
    public static boolean isPrime(int n) 
	{
        /*
         * This function returns true if n is prime, and false otherwise.
         */
        if (n <= 1)
		{
            return false;
        }
		
        for (int i = 2; i <= Math.sqrt(n); i++) 
		{
            if (n % i == 0) 
			{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
	{
        int n = 20; // the upper limit of the prime numbers to be printed
        for (int i = 2; i <= n; i++) 
		{
            if (isPrime(i)) 
			{
                System.out.println(i);
            }
        }
    }
}
