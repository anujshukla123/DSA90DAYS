package Day2;

public class Reverse {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        Reverse solution = new Reverse();

        System.out.println(solution.reverse(123));     // 321
        System.out.println(solution.reverse(-123));    // -321
        System.out.println(solution.reverse(120));     // 21
        System.out.println(solution.reverse(0));       // 0
        System.out.println(solution.reverse(1534236469)); // 0 (overflow)
    }
}
