public class CheckPalindrome {
    public static boolean isPalindrome(String myString) {
		int left = 0;
		int right = myString.length() - 1;
		boolean isPalindrome = true;
		while (left < right) {
			if (myString.charAt(left) == myString.charAt(right)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
			left++;
			right--;
		}
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(args[0]));
    }
}
