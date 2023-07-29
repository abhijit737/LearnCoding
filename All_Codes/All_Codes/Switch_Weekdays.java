import java.util.Scanner;

public class Switch_Weekdays {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your choice:");
        int day = s.nextInt();
        
        switch(day){
        case 1:
        System.out.println("The Day is Monday");
        break;
        case 2:
        System.out.println("The Day is Tuesday");
        break;
        case 3:
        System.out.println("The Day is Wednesday");
        break;

        case 4:
        System.out.println("The Day is Thrusday");
        break;

        case 5:
        System.out.println("The Day is Friday");
        break;

        case 6:
        System.out.println("The Day is Saturday");
        case 7:
        System.out.println("The Day is Sunday");
        default :
        System.out.println("You Entered a Wrong input");
        }
        
    
    }
}
