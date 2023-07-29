import java.util.*;
class EvenOddSaperateSum
{
	public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	int even=0;
	int odd=0;
	ArrayList <Integer> arr1 = new ArrayList();
	ArrayList <Integer> arr2 = new ArrayList();
	
	for(int i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			
			arr1.add(i);
			even+=i;
		}
		else
		{	
			
			arr2.add(i);
			odd+=i;
			
		}

	}
	
	System.out.println("even numbers are "+arr1);
	System.out.println("odd numbers are "+arr2);
	System.out.println("even num sum is "+even);
	System.out.println("odd number sum is "+odd);

    } 
} 