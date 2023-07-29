//Implementation by extending thread
class A extends Thread { 
    public void run()
    {
    try 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("I am running");
            Thread.sleep(1000);
        }
        
    } 
    catch (InterruptedException e) {
        // TODO: handle exception
    }
        
    }
}
class Thread1 {
        public static void main(String[] args)  throws InterruptedException  {
        A a = new A();
        a.start();
        for (int i = 1; i <= 5; i++) {

            System.out.println("I am main thread");
            Thread.sleep(1000);

        }
    }}