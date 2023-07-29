import javax.sound.midi.Soundbank;

class Employee {
    String name ;
    int emp_id;
    Employee(String name,int emp_id){
        this.name = name;
        this.emp_id = emp_id;


    }
    public static void main(String[] args) {
        Employee e1 = new Employee("vivek", 101);
        Employee e2 = new Employee("deepak", 102);

       // System.out.println("e1" + "e2" );
    }
    
}
