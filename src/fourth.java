import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input the number
        System.out.println(getFactorial(n));
    }
    /**
     * getFactorial - function that find factorial of given number
     *
     * @param n - number to find factorial
     * @return - return factorial of number
     */
    public static int getFactorial(int n) {
        if (n == 1) { // base case
            return 1;
        }
        else {
            return n * getFactorial(n-1); // repeating statement
        }
    }
}
