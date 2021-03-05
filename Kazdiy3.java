import java.util.Arrays;
import java.util.Random;

public class Kazdiy3 {
    public static void main(String[] args) {
        func();
    }
    public static void func() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = 2; i < array.length; i=i+3) {

            array[i] = 3;
        }
        System.out.println(Arrays.toString(array));
    }

}

