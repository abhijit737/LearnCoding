import java.util.Scanner;

 class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        int s1 = sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int s2 = sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        int s3 = sc.nextInt();
        int avg = (s1+s2+s3)/3;
        if(avg >= 40 && s1>=33 && s2>=33&& s3>=33){
            System.out.println("You are passed,Your avg is: "+avg);
           
        }
        else
        System.out.println("You are fail,Your average is: " +avg);

    }
    
}
