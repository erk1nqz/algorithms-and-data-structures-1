import java.util.Scanner;

public class tenth {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // input first number
        int b = sc.nextInt(); // input second number
        System.out.println(findGCD(a, b));
    }
    /**
     * findGCD - function find the greatest common divisor of two numbers
     *
     * @param a - first number
     * @param b - second number
     * @return - returns gcd of two numbers
     */
    public static int findGCD(int a, int b) {
        if (b == 0) return a; // base case
        else return findGCD(b, a % b); // repeating statement
    }
}
