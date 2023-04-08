import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input the length of array
        int[] arr = new int[n]; // declaring a new array of size n
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //adding element to array
        }
        System.out.println(getReverse(n, arr));
    }
    /**
     * getReverse - function return string that copying given array but in reverse order
     *
     * @param n - length of given array
     * @param arr - array to reverse
     * @return - reverse string
     */
    public static String getReverse(int n, int[] arr) {
        if (n == 1) { // base case
            return Integer.toString(arr[0]);
        }
        else {
            return Integer.toString(arr[n-1]) + " " + getReverse(n-1, arr); // repeating statement
        }
    }
}
