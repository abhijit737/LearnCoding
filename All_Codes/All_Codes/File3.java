import java.io.FileWriter;
//writing in file

public class File3 {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("D:\\COde PRACTICE\\12_practice_FileHandling\\1.txt");
            try{
                f.write("How are you");
            }
            finally{
                f.close();
            }

            System.out.println("Dtaa is entered");
        }
        catch(Exception i){
            System.out.println(i);
        }
    }
    
}
