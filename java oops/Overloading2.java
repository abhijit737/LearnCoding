public class Overloading2 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading2 load = new Overloading2();

        int sum1 = load.add(2, 3);
        System.out.println("Sum 1: " + sum1);

        double sum2 = load.add(2.5, 3.7);
        System.out.println("Sum 2: " + sum2);

        int sum3 = load.add(2, 3, 4);
        System.out.println("Sum 3: " + sum3);
    }
}
