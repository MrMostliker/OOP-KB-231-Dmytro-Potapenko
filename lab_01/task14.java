import java.util.Arrays;
import java.util.Scanner;

public class task14 {

    public static int[] input_data() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        String[] parts = input.nextLine().split(" ");
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        return array;
    }

    public static void cycleSwap(int[] array) {
        if (array.length <= 1) return;
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1 || shift <= 0) return;
        shift %= array.length;

       
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

    
        for (int i = 0, j = shift - 1; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        for (int i = shift, j = array.length - 1; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = input_data();

        int[] array1 = Arrays.copyOf(array, array.length);
        cycleSwap(array1);
        System.out.println("Shift 1: " + Arrays.toString(array1));

        System.out.print("Enter shift: ");
        int shift = scanner.nextInt();

        int[] array2 = Arrays.copyOf(array, array.length);
        cycleSwap(array2, shift);
        System.out.println("Shift " + shift + ": " + Arrays.toString(array2));
    }
}
