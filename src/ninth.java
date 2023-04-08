import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input first argument
        int k = sc.nextInt(); // input second argument
        System.out.println(findBinom(n, k));
    }
    /**
     * findBinom - function find binomial coefficient by two number
     *
     * @param n - first bottom argument
     * @param k - second top argument
     * @return - returns binomial coefficient of two numbers
     */
    public static int findBinom(int n, int k) {
        if (k == 0 || k == n) return 1; // base case
        else return findBinom(n-1, k-1) + findBinom(n-1, k); // repeating statement
    }
}
