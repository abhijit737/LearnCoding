import java.util.Scanner;

//swap two number
class Swapp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter second Number:");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping a is"+ " "+a+ " and b is " +b);

    }
}