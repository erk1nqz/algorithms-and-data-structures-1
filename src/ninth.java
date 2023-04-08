import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findBinom(n, k));
    }
    public static int findBinom(int n, int k) {
        if (k == 0 || k == n) return 1;
        else return findBinom(n-1, k-1) + findBinom(n-1, k);
    }
}
