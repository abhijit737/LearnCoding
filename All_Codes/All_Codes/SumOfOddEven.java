import java.util.*;
class SumOfOddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char choice;
        int evensum =0;
        int oddsum =0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        do{
        if(n%2==0){
            evensum = evensum+n;
            System.out.println(evensum);

        }

        else{
            oddsum=oddsum+n;
            System.out.println(oddsum);
        }
        System.out.println("do you want to continue? y/n");
        choice = sc.next().charAt(0);

    }        
    while(choice == 'y' || choice == 'Y');
    System.out.println("sum of even number is "+evensum);
    System.out.println("sum of odd number is "+oddsum);
}
}

