import java.util.Scanner;

class Reverse_Right_Triangle{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}