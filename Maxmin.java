import java.util.Arrays;
import java.util.Random;

public class Maxmin {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i += 2) {
            if (i % 2 == 0) {
                array[i] = i;

            }
            int[] array2 = new int[5];
            for (i = 0 , j = 0; i < array.length; j += 2, i++) {
                array2[j] = array[i];
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
