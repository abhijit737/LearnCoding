import java.io.*;
//Read data of file

public class File4 {
    public static void main(String[] args) throws IOException {
            try (FileReader f = new FileReader("D:\\COde PRACTICE\\12_practice_FileHandling\\1.txt")) {
                int i;
                while((i= f.read ())!=-1){
                    System.out.print((char)i);
                }
            }
                
        }
        
    }
    

