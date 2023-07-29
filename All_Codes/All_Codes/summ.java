public class summ {
    public static void main(String[] args) {
        int a=25;
        int res=0;
        while(a!=0){
            res =res+a%10;
            a = a/10;

        }
        System.out.println(res);
    }
    
}
