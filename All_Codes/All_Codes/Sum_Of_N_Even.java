public class Sum_Of_N_Even {
    public static void main(String[] args) {
        int sum = 0;
        int n =3;
        for(int i=0;i<n;i++){
            sum= sum +(2*i);
        }
        System.out.print("The sum of n even number is:" +sum);
        //System.out.println(sum);
    }
}