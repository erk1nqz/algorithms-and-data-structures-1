import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(getPower(a, n));
    }

    public static int getPower(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * getPower(a, n-1);
        }
    }
}
