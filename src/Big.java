import java.math.BigInteger;

public class Big {
    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        int i = 0;
        while (i <= 30) {
            System.out.println(i + " = " + factorial(i));
            i = i + 1;

        }
    }
}