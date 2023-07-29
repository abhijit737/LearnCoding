import java.util.*;

public class GcdQuories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int q = scanner.nextInt();
            int[] x = new int[q];
            for (int i = 0; i < q; i++) {
                x[i] = scanner.nextInt();
            }

            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                heap.offer(a[i]);
            }

            for (int i = 0; i < q; i++) {
                int xi = x[i];
                boolean found = false;
                while (!heap.isEmpty()) {
                    int k = heap.peek();
                    if (gcd(xi, k) > 1) {
                        System.out.print(k + " ");
                        heap.remove(k);
                        found = true;
                        break;
                    } else {
                        heap.remove(k);
                    }
                }
                if (!found) {
                    int k = a[0];
                    System.out.print(k + " ");
                    heap.remove(k);
                }
            }
            System.out.println();
        }
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
