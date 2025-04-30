import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("no roots");
        } else if (d == 0) {
            System.out.println("One root:" + -b / (2 * a));
        } else {
            double r1 = (-b - Math.sqrt(d)) / (2 * a);
            double r2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Two roots:" + r1 + " " + r2);
        }
    }
}



