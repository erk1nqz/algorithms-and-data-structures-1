import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFibonacci(n));
    }
    public static int getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return getFibonacci(n-1) + getFibonacci(n-2);
        }
    }
}
