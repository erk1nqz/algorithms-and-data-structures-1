import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input a length of array
        int[] arr = new int[n]; // declaring an array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // adding elements of array
        }
        System.out.println(findAverage(n, arr));
    }
    /**
     * findAvg - function sum up all numbers and dividing by the number of numbers
     *
     * @param n - length of given array
     * @param arr - array to work with them
     * @return - returns average of array
     */
    public static double findAverage(int n, int[] arr) {
        double sum = arr[0]; // declaring new value
        for (int i = 1; i < n; i++) { // starting with 1st index because of minNum value is started from 0
            sum += arr[i]; // adding each element of array to value sum
        }
        return sum / n; // returning average by dividing sum to n
    }
}
