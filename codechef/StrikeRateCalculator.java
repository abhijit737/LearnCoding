

import java.util.Scanner;

public class StrikeRateCalculator 
{
	public static void main(String[] args)
 	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // number of test cases
		while (t-- > 0) 
		{
			int n = sc.nextInt(); // number of balls played by Gill
			int[] runs = new int[n];
			for (int i = 0; i < n; i++)
			{
				runs[i] = sc.nextInt(); // runs scored on each ball
			}
			int count = 0; // number of times strike rate became 100
			int balls = 0; // total balls faced
			int runsScored = 0; // total runs scored
			for (int i = 0; i < n; i++)
			{
				balls++;
				runsScored += runs[i];
				int strikeRate = runsScored * 100 / balls;
				if (strikeRate == 100) 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}