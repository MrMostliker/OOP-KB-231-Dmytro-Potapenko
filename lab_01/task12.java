import java.util.Scanner;
import java.util.Arrays;

public class task12 {
    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        result[0] = false;
        result[1] = false;
        for (int i = 2; i < array.length; i++) {
            result[i] = (array[i] == array[i - 1] + array[i - 2]);
        }
        return result;
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
        int[] input = input_data();
        boolean[] result = getSumCheckArray(input);
        System.out.println(Arrays.toString(result));
    }
}
