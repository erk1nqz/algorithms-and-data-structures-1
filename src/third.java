import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input the number
        System.out.println(isPrime(n));
    }
    /**
     * isPrime - checking is the given number prime or not
     *
     * @param n - number to check
     * @return - returns true if number prime, false otherwise
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) { // choosing from 2 to n-1
            if (n % i == 0) { // if the number have any divisors
                return false;
            }
        }
        return true;
    }
}
