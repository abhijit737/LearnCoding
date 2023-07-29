import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks=sc.nextInt();
        if(marks<25){
            System.out.println("You failed,your grade is F.");
        }
        if(marks>=25&& marks<45){
            System.out.println("Your grade is E");
        }
        else if(marks>=45&&marks<50){
            System.out.println("Your Grade is D");
        }
        else if(marks>=50&&marks<60){
            System.out.println("Your grade is C");
        }
        else if(marks>=60 && marks<80) {
            System.out.println("Your grade is B");
        }
        else if(marks>=80&&marks<=100) {
            System.out.println("Your Grade is A");
        }
    else{
        System.out.println("enter correct marks");
    }
    }
    
}
