public class rev_pr {
    public static void main(String[] args) {
        int num = 121;
        int rev=0, rem;
        int temp=num;
        while(temp!=0)
        {
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        System.out.println(rev);
    }
    
}
