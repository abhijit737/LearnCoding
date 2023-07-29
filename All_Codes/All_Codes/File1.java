import java.io.File;
import java.io.IOException;

public class File1 { //Creating aa file
    public static void main(String[] args) {
        File f = new File("D:\\COde PRACTICE\\12_practice_FileHandling\\1.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File not created");
            }
        }
        catch(IOException i){
            System.out.println("Exception handeld ");
        }
    }
}
