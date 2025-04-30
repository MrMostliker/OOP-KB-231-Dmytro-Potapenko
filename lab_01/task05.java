import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter h:");
        int h = scanner.nextInt();

        if (a <= b && a < h) {
            System.out.println("Impossible");
        }
         else if (a >= h) {
            System.out.println(1);
         }
         else {
            int days = (int) Math.ceil( (double)(h - b) / (a - b));
            System.out.println(days + " Days");
        }
    }
}

