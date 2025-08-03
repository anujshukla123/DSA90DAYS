package Day2;

public class Atoi {

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, n = s.length();
        int sign = 1;
        int result = 0;

        // 1. Skip whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check for sign
        if (i < n) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        // 3. Skip leading zeros
        while (i < n && s.charAt(i) == '0') {
            i++;
        }

        // 4. Parse digits and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check if result will overflow
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    // Test
    public static void main(String[] args) {
        Atoi parser = new Atoi();

        System.out.println(parser.myAtoi("42"));              // 42
        System.out.println(parser.myAtoi("   -42"));          // -42
        System.out.println(parser.myAtoi("0032"));            // 32
        System.out.println(parser.myAtoi("4193 with words")); // 4193
        System.out.println(parser.myAtoi("words and 987"));   // 0
        System.out.println(parser.myAtoi("-91283472332"));    // -2147483648
        System.out.println(parser.myAtoi("21474836460"));     // 2147483647
        System.out.println(parser.myAtoi(""));                // 0
        System.out.println(parser.myAtoi("+"));               // 0
    }
}
