class Cellphone{
    public void Ring(){
        System.out.println("The phone is Ringing....");
    }
    public void Vibrate(){
        System.out.println("vibrating....");
    }
    public void NotVibrate(){
        System.out.println("The phone is not vibrating");
    }
}
public class Ops_08 {
    public static void main(String[] args) {
        Cellphone one = new Cellphone();
        one.Ring();
        one.NotVibrate();
        one.Vibrate();

        
    }
    
}
