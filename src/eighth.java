import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // input string
        System.out.println(isAllDigits(text));
    }
    /**
     * isAllDigits - function check is string contain all digits
     *
     * @param text - given string to check
     * @return - returns true if string contain all digits, false otherwise
     */
    public static boolean isAllDigits(String text) {
        if (text.length() == 1) return Character.isDigit(text.charAt(0)); // base case
        else return Character.isDigit(text.charAt(0)) && isAllDigits(text.substring(1)); // repeating statement
    }
}
