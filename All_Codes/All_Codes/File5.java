import java.io.*;
//rename a file

public class File5 {
    public static void main(String[] args) {
        File f = new File("D:\\COde PRACTICE\\12_practice_FileHandling\\1.txt");
        File r = new File("D:\\COde PRACTICE\\12_practice_FileHandling\\2.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("Not present");
        }
    }
    
}
