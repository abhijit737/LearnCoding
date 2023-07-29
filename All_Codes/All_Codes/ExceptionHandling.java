public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int a = 100,b=0,c;
            c = a/b; //arithmetic exception
            System.out.println(c);

        } 
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
