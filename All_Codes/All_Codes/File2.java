import java.io.File;
//Displaying File content 
public class File2 {
    public static void main(String[] args) {
        File f = new File("D:\\COde PRACTICE\\12_practice_FileHandling\\1.txt");
        if(f.exists()){
            System.out.println("File is there"+f.getName());
            System.out.println("File is present at"+f.getAbsolutePath());

        }
        else{
            System.out.println("File not found");
        }
    }
    
}
