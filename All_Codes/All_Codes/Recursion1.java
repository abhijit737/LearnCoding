class Recursion1 {


    static void printhello() {
    static int count = 0;

        if (count <= 5) {
		        count++;


            System.out.println("Hello world");
            printhello();
        }
    }

    public static void main(String[] args) {
        printhello();

    }
}