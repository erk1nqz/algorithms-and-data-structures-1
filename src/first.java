import java.util.Scanner;

public class first {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input a length of array
        int[] arr = new int[n]; // declaration an array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // adding elements of array
        }
        System.out.println(findMin(n, arr));
    }
    /**
     * findMin - function that help you find a minimum number from given array
     *
     * @param n - length of given array
     * @param arr - array to work with them
     * @return - returns minimum number of array
     */
    public static int findMin(int n, int[] arr) {
        int minNum = arr[0]; // declaring a new value
        for (int i = 1; i < n; i++) { // starting with 1st index because of minNum value is started from 0
            if (arr[i] < minNum) { // checking for minimum
                minNum = arr[i]; // updating value if new less
            }
        }
        return minNum; // returning minimum value
    }
}
