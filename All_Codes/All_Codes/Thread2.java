//Implementing by runnable interFACE
class A implements Runnable {
     
        public void run(){
            for(int i =1;i<5;i++){
            System.out.println("Child thread");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
            }

        }
    }
        
    }
    class Thread2{
        public static void main(String[] args) {
            A a = new A();
            Thread t = new Thread(a);
            t.start();
            for(int i =1;i<5;i++){
                System.out.println("main thread");
            }

            
        }
    }

    
