//25 becomes 7
public class ADD {
    public static void main(String[] args) {
        int num=25;
        int res=0;
        while(num!=0)
        {
           //rem = num%10;//5
            res =res+num%10;
            num=num/10;
        }
        System.out.println(res);
        //System.out.println("ghfghg");
    }
    
}
