class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is:"+id);

        System.out.println("My name is:"+name);
    }
}
class Ops_01{
    public static void main(String[] args) {
        System.out.println("this is a custom class");
        Employee xyz=new Employee();
        Employee abc= new Employee();
        xyz.id = 123;
        xyz.name="Vivekkk";
        abc.id=1234;
        abc.name="Ranjannn";


        xyz.printDetails();
        abc.printDetails();
        
    }
}