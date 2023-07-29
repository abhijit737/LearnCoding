import java.util.Scanner;
public class LCM_Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0, temp1 =0, temp2=0,n1,n2,hcf,lcm;
        System.out.println("Enter the first number:");

        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();
        temp1 = n1;
        temp2 = n2;
        while(temp2!=0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;


        }
        hcf = temp;
        lcm = (n1*n2)/hcf;
        System.out.println("lcm is:"+lcm);
        System.out.println("hcf is:"+hcf);
    }
    
}
