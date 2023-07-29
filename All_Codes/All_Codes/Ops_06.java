class Tommi{
    public void hit(){
        System.out.println("The Player is Hitting...");
    }
    public void run(){
        System.out.println("The player is running");
    }
    public void fire(){
        System.out.println("The player is firing:");
    }
}
public class Ops_06 {
    public static void main(String[] args) {
        Tommi player = new Tommi();
        player.hit();

        player.run();
        player.fire();

    }
    
}
