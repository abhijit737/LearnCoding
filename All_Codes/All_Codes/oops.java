 class student{
    String studentName;
    String studentCity;
    int studentid;
    student(){
        System.out.println("Creating Object with non paramaterized constructor");//paramaterized constructor
    }
    student(int a){ //paramater provided it can be string double anything
        System.out.println("Creating object with paramaterized constructor"); //paramaterized constructor
    }
    student(int i,String n,String c){
        System.out.println("different paramater provided");
    }

    public void show(){
        System.out.println("my name is" +" "+studentName);
    }
    public void showDetails(){
        System.out.println("I live in"+" "+studentCity);
    }
 }
 class oops {
    public static void main(String[] args) {
        student s1 = new student();
        s1.studentName = "vivek";
        s1.studentCity = "Bangalore";
        s1.show();
        s1.showDetails();

        student s2 = new student(123);//paramater provided
        s2.studentName="Nikhil";
        s2.studentCity="Chandpole";
        student s3 = new student(1021, "anand", "jaipur" );
        
    }
    
}
