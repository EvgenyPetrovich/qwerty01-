import java.util.Arrays;
import java.util.Random;

public class Chet {
    public static void main(String[] args) {
    func();
    }
    public static void func() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 1;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                array[j] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}

