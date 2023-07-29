import javax.lang.model.element.Element;

//add 5 float value using Array

public class SUm01 {
    public static void main(String[] args) {
        float marks []= {10.2f,15.6f,121.98f,843.9f,63.4f};
        float sum = 0;
        for(float element:marks)
        sum = element+sum;
        System.out.println("The sum of elements is:"+sum);

    }
}
