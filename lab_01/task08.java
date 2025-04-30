import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            int value = scanner.nextInt();
            if (value == 0) break;
            sum += value;
            count++;
        }
        System.out.println(sum / count);
    }
}
