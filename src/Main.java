import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice the problem to solve (1-10): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                first.main();
            case 2:
                second.main();
            case 3:
                third.main();
            case 4:
                fourth.main();
            case 5:
                fifth.main();
            case 6:
                sixth.main();
            case 7:
                seventh.main();
            case 8:
                eighth.main();
            case 9:
                ninth.main();
            case 10:
                tenth.main();
        }
    }
}