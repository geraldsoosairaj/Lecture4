public class DebuggingExample {
    public static int sumEvenIndices(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i + 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] evenLengthArray = {2, 5, 7, 9};
        System.out.println(sumEvenIndices(evenLengthArray));

        int[] oddLengthArray = {2, 5, 7, 9, 12};
        System.out.println(sumEvenIndices(oddLengthArray));
    }
}
