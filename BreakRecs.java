import java.util.Scanner;

class BreakRecs
{
    public static void main(String args[])
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    
    for(int i=0; i<size; i++)
    {
        arr[i] = sc.nextInt();
        
        int min = arr[0];
        int max = arr[0];
        int count1 = 0;
        int count2 = 0;
        for(int i=1; i<n; i++)
        {
            if(arr[i] > max)
            {
                count1++;
                max = arr[i];
                
            }
            if(arr[i] < min)
            {
                count2++;
                min=arr[i];
            }
        }
        System.out.println(count1+" "+count2);
    }
    
    
}
