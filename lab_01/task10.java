import java.util.Scanner;

public class task10 {
    public static int max(int[] array) {
        int max = array[0];
        for (int val : array) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
public static int[] input_data(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your numbers: ");

    String[] parts = input.nextLine().split(" ");
    int[] array = new int[parts.length];
    for (int i = 0; i < parts.length; i++) {
        array[i] = Integer.parseInt(parts[i]);
    }
    return array;
}
    public static void main(String[] args) {
        int array[] = input_data();
        System.out.println("Max: " + max(array));
    }
}
