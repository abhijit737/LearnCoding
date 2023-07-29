import java.util.Scanner;

public class SuperDigitExample 
{
	
    public static int superDigit(long n) 
	{
        if (n < 10)
		{
            return (int) n;
        }
		else
		{
            long sum = 0;
            while (n > 0) 
			{
                sum += n % 10;
                n /= 10;
            }
            return superDigit(sum);
        }
    }
    
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        System.out.print("Enter the repeat count: ");
        int k = sc.nextInt();
        long sum = k * superDigit(n);
        System.out.println("Super digit of " + n + " repeated " + k + " times: " + superDigit(sum));
    
    }
}
