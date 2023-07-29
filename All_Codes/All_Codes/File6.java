import java.io.*;

public class File6 {
    public static void main(String[] args) throws IOException {
        FileInputStream f= new FileInputStream("D:\\COde PRACTICE\\12_practice_FileHandling\\1.txt");
        FileOutputStream w= new FileOutputStream("D:\\COde PRACTICE\\12_practice_FileHandling\\2.txt");
        int i ;
        while((i=f.read())!=-1){
        w.write((char)i);        
    }
    System.out.println("Data Copied");
    }
    
    
}
