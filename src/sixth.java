import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // input the number
        int n = sc.nextInt(); // input a power of number
        System.out.println(getPower(a, n));
    }
    /**
     * getPower - function finds "a power of n"
     *
     * @param a - number
     * @param n - power of number
     * @return - returns a power of n
     */
    public static int getPower(int a, int n) {
        if (n == 1) { // base case
            return a;
        }
        else {
            return a * getPower(a, n-1); // repeating statement
        }
    }
}
