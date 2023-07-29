import java.util.Scanner;


class MergeTwoArrays
{
   public static void main(String args[])
   {

/*
	
	 int a[]={10,20,30};

        int b[]={40,50,60};
        int a_len=a.length;
        int b_len=b.length;
        int c_len=(a_len+b_len);
         int c[] = new int[c_len];
            for(int i=0;i<a.length;i++){
                c[i] = a[i];
            }
            for(int i=0;i<b.length;i++){
                c[a_len+i]=b[i];

            }
            for(int i=0;i<c.length;i++){
                System.out.println(c[i]);
            }

	

*/

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array1 size");
	int asize=sc.nextInt();

	System.out.println("Enter array2 size");
	int bsize=sc.nextInt();
	
	int arr1[] = new int[asize];

	int arr2[] = new int[bsize];

	int csize = asize+bsize;

	int arr3[] =new int[csize];

	System.out.println("Enter array1 elements");

	for(int i=0;i<asize;i++)
	{
		arr1[i]=sc.nextInt();


	}
	System.out.println("Enter array2 elements");


	for(int i=0;i<bsize;i++)
	{
		arr2[i]=sc.nextInt();


	}
		

	
	for(int i=0;i<asize;i++)
	{
		arr3[i]=arr1[i];

	}

	for(int i=0;i<bsize;i++)
	{
		arr3[asize+i]=arr2[i];

	}

	System.out.println("Merged array elements");


		for(int i=0;i<csize;i++)
	{
		System.out.println(arr3[i]);

	}


	

   }

}