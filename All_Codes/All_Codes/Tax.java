import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double tax = sc.nextFloat();
        double salary = 0;
        //double tax =0;
        if (tax < 25000){
            tax = tax+0;
        }

        else if(salary >25000 && salary < 50000){
            tax = tax+0.05*(salary -25000);



        }
        else if(salary > 50000 && salary <100000){
            tax = tax + 0.05 * (50000 - 25000);
            tax = tax + 0.2 * (salary -50000);
        }
        else if(salary>100000){
            tax = tax + 0.05 *  (50000 - 25000);
            tax = tax + 0.05 * (100000 -50000);
            tax = tax + 0.3 * (salary -100000);



        }
        System.out.println(tax);


    }
    
}
//code not working
