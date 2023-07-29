public class MissingNumArr2 {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // Total number of elements including the missing one
        int xorSum = 0; // XOR of all numbers from 1 to n

        for (int i = 1; i <= n; i++) {
            xorSum ^= i;
        }

        for (int num : nums) {
            xorSum ^= num;
        }

        return xorSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 5}; // Example input array
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number is: " + missingNumber);
    }
}
