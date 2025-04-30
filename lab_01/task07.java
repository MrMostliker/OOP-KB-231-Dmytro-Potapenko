import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true) {
            int value = scanner.nextInt();
            if (value == 0) break;
            if (value > max) max = value;
        }
        System.out.println(max);
    }
}
