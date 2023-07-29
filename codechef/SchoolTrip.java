import java.util.*;

public class SchoolTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            int totalCapacity = 0;
            int maxCapacity = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    totalCapacity += a[i][j];
                    maxCapacity = Math.max(maxCapacity, a[i][j]);
                }
            }
            if (totalCapacity < k + 1) {
                System.out.println(-1);
            } else {
                int minDistance = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        int distance = Math.max(Math.abs(i - (n-1)), Math.abs(j - (m-1)));
                        if (a[i][j] == maxCapacity) {
                            distance = Math.max(distance, Math.abs(i - 0) + Math.abs(j - 0));
                        }
                        minDistance = Math.min(minDistance, distance);
                    }
                }
                System.out.println(minDistance);
            }
        }
    }
}