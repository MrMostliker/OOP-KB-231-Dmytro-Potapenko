import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bill:");
        double bill = scanner.nextDouble();
        System.out.println("Enter amount of friends:");
        int friends = scanner.nextInt();

        if (bill < 0) {
            System.out.println("Error: negative bill");
        } else if (friends <= 0) {
            System.out.println("Error: number of friends must be positive");
        } else {
            double total = bill * 1.1;
            System.out.println(String.format("%.02f$", (double)total / friends));
        }
    }
}
