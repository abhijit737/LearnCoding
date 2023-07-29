import javax.lang.model.element.Element;

//a given element isInArray

public class isInArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int num = 5;
        boolean isInArray = false;
        for(int element:a){
            if(num==element){
                isInArray = true;
                break;
            }
        }
            if(isInArray){
                System.out.println("The number is present:");
            }
            else{
                System.out.println("The number is not present in the array:");
        }


            
    }
}
    

