//import java.net.Socket;

//import javax.sound.midi.Soundbank;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;


    }
    public String getName(){
        return name;

        

    }
    public void setName(String n){
        name =n;


    }
}


public class Ops_02 {
    public static void main(String[] args) {
        
    
    Employee harry = new Employee();
   //harry.setName = "Hello";
    harry.setName("Vivek");
    harry.salary=123214;

   System.out.println(harry.getSalary());
    System.out.println(harry.getName());
    }


}
