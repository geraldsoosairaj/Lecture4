public class RatioReciprocal {
    public static double ratio(int n, int d) {
        return n / d;
    }

    public static double reciprocal(int n) {
        return 1 / n;
    }

    public static void main(String[] args) {
        System.out.println(ratio(3, 4) * reciprocal(7));
    }
}
