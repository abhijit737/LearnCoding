//constructor implementation
public class Employee1 {
    String name;
    int emp_id;
    Employee1(String name,int emp_id){
        this.name = name;
        this.emp_id = emp_id;
    }
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Deepak",1000);
        Employee1 e2 = new Employee1("Vivek",1011);
        System.out.println("employee1 : " + e1.name + " " + e1.emp_id);
        System.out.println("employee2 : " + e2.name + " " + e2.emp_id);


    }
    
}
