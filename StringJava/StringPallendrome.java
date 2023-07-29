import java.util.Scanner;

class StringPallendrome {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
	   System.out.println("Enter String ");
        String name = scan.next();
        int len = name.length();
        String dup=name;
        String rev ="";
        
        for(int i=len-1;i>=0;i--)
        {
            rev+=name.charAt(i);
        }
        
        if(dup.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println("pallendrome String");
        }
        else
        {
            System.out.println("no pallendrome string");

        }
        
        
        
    }
}