import java.math.BigInteger;
import java.util.Scanner;

public class PanLinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger n = scanner.nextBigInteger();
            int officers = 20;
            BigInteger[] divisionResult = n.divideAndRemainder(BigInteger.valueOf(officers));
            BigInteger remaining = divisionResult[1];
            if (remaining.equals(BigInteger.ZERO)) {
                System.out.println(0);
            } else {
                BigInteger applicationsPerOfficer = divisionResult[0];
                BigInteger unprocessed = BigInteger.valueOf(officers).subtract(remaining).multiply(applicationsPerOfficer);
                System.out.println(unprocessed);
            }
        }
        scanner.close();
    }
}
