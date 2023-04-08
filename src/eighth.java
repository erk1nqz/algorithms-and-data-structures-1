import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isAllDigits(text));
    }
    public static boolean isAllDigits(String text) {
        if (text.length() == 1) return Character.isDigit(text.charAt(0));
        else return Character.isDigit(text.charAt(0)) && isAllDigits(text.substring(1));
    }
}0
