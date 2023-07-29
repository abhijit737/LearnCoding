//encapsulation
class Employee{
    private int emp_id;

    public void setEmpid(int emid){
        emp_id = emid;
    }
    public int getEmpid(){
        return emp_id;
    }

}

class Company {
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
    System.out.println(e.getEmpid());
}
}