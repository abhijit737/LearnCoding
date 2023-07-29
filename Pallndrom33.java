import java.util.Scanner;
class Pallndrom33{
	public static void main(String [] Args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter number");
	int num=sc.nextInt();
	int rem,result=0;
	int temp=a;                      // stores value of variable
	while(a>0)
	{
		rem=num%10;                  // finding the remainder
		result =(result*10)+rem;
		num=num/10;                 // gives the quotient
	
	} 
	if(temp==result){                // cheackes the actual value with result
	System.out.println("number "+temp+" is pallendrom");
	}
	else{
	System.out.print("number "+temp+" is not pallendrom");
	}


}
}