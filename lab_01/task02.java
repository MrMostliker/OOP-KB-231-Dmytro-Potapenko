import java.util.Scanner;

public class task02 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int h = (seconds / 3600) % 24;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;

        System.out.printf("%d:%02d:%02d%n", h, m, s);
    }
}
