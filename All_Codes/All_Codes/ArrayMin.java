public class ArrayMin 
{
    public static void main(String[] args) 

   {
        int [] a ={94092,88438,47473} ;
        int min = a[0];
        for(int i=1;i<a.length;i++)
	{
            if(min>a[i])
	    {
                min = a[i];
            }
        }
        System.out.println(min);
    }
    
}
