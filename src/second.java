import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findAverage(n, arr));
    }

    public static double findAverage(int n, int[] arr) {
        double sum = arr[0];
        for (int i = 1; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
}
