import java.util.Scanner;

/**
 * 6 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
 * переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            int c = 10;
            double one = Math.abs(c - a);
            double two = Math.abs(c - b);
            if (one == two) {
                System.out.println("Числа " + a + " и " + b + " равноудалены от " + c);
            }
            if (one > two) {
                System.out.println("Число " + b + " ближе к " + c);
            }
            if (one < two) {
                System.out.println("Число " + a + " ближе к " + c);
            }
        }
    }
}
