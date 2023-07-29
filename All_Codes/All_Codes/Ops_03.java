class Cellphone{
    public void vibrate  (){
       // return String;
       System.out.println("Vibrating...");

    }
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void CallFriend(){
        System.out.println("Calling Alok");
    }
}
public class Ops_03 {
    public static void main(String[] args) {
        
    
    Cellphone one = new Cellphone();
    one.Ring();

    one.vibrate();
    one.CallFriend();

    
    }
}
