import java.util.Scanner;
import java.util.Arrays;

public class task13 {
    public static int[] removeLocalMaxima(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
    
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] <= array[i - 1] || 
                i < array.length - 1 && array[i] <= array[i + 1] ||
                i == 0 && array.length > 1 && array[i] <= array[i + 1] ||
                i == array.length - 1 && array.length > 1 && array[i] <= array[i - 1]) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0; 

        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] <= array[i - 1] || 
                i < array.length - 1 && array[i] <= array[i + 1] ||
                i == 0 && array.length > 1 && array[i] <= array[i + 1] ||
                i == array.length - 1 && array.length > 1 && array[i] <= array[i - 1]) {
                result[index++] = array[i];
            }
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
        int[] result = removeLocalMaxima(input);
        System.out.println(Arrays.toString(result));
    }
}
