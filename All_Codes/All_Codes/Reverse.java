import java.lang.reflect.Array;
import java.util.Arrays;

class Reverse{
    public static void main(String[] args) {
        int [] a= {10,20,30};
        System.out.println("Original Array is:" +Arrays.toString(a));
        
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i]= a[a.length-i-1];
            a[a.length-i-1] = temp;

            
        }
        System.out.println("Reverse Array is:" +Arrays.toString(a));

    }
}