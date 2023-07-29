//this keyword
class Test{
    int i; //instance variable
    void show(int i){
        this.i = i;
    }
    void setValue(){
        System.out.println(i);
    }
}
class This_Keyword {

       public static void main(String[] args) {
        Test t = new Test();
         t.show(10);
        t.setValue();
    }
    
}
            