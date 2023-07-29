public class PrimeNumber2 {

    public static void main(String[] args) {
        
        int num=81;
        boolean flag=false;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag=true;
            }
        }
        
        if(num==1 or num==0)
        {
            System.out.println(""+num+" is neither prime nor composite");
        }
        else
        {
             if(flag==true)
            {
             System.out.println(""+num+" is not a prime no.");
            }
            else
           {
             System.out.println(""+num+" is  a prime no.");
            }
         }
    }
    
}