import java.util.Scanner;

public class task11 {
    public static int sum(int[] array) {
        if (array == null || array.length == 0) return 0;
        int sum = 0;
        for (int val : array) {
            if (val % 2 == 0) {
                sum += val;
            }
        }
        return sum;
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
        int[] array = input_data();
        System.out.println("Sum of even: " + sum(array));
    }
}
