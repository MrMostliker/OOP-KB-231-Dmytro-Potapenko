import java.util.Scanner;

public class task03 {
    final static int password = 12345;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
