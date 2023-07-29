/*The problem involves finding the maximum number of people that can be accommodated in a stadium given the availability of tickets and the seating arrangements. The solution requires a combination of efficient algorithms and data structures.

One approach to solving this problem could be to use binary search. The idea is to find the largest number of people that can be accommodated in the stadium by performing a binary search on the number of people.

First, we need to sort the array of seats in increasing order of their price. Then we perform binary search on the range of possible values for the number of people, from 0 to the total number of tickets available.

For each value of the number of people, we can use a sliding window approach to determine whether or not they can be accommodated in the stadium. We keep a running total of the cost of the seats occupied by the people in the window, and check whether it exceeds the total budget for the group. If it does, we slide the window to the right to remove the seat with the highest price until the cost of the occupied seats is within the budget.

The maximum number of people that can be accommodated is the highest value of the number of people that satisfies the condition.

Here is a code snippet in Java that demonstrates the approach:

java

// still it is incomplete bcoz constraints
*/



import java.util.*;

public class IplTicketRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0, r = m;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int cnt = 0, cost = 0;
            for (int i = 0; i < n; i++) {
                if (cnt >= mid) {
                    break;
                }
                if (a[i] <= y) {
                    cnt++;
                    cost += a[i];
                }
            }
            if (cnt >= mid && cost <= x * mid) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}