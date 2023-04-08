import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input the number
        System.out.println(getFibonacci(n));
    }
    /**
     * getFibonacci - function find n-th element in Fibonacci sequence
     *
     * @param n - fibonacci number to find
     * @return - returns founded fibonacci number
     */
    public static int getFibonacci(int n) {
        if (n == 1 || n == 2) { // base case
            return 1;
        }
        else {
            return getFibonacci(n-1) + getFibonacci(n-2); // repeating statement
        }
    }
}
