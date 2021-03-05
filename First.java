/**
 * 1 Вычисляет следующее выражение: 100 - (2 * (n + 3) ∗ n - 7) ∗ n + 3. n - натуральное число,
 * вводится из консоли
 */

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int result = 100 - (2 * (n + 3) * n - 7) * n + 3;
            System.out.println(result);
        } else {
            System.out.println("Это не число");
        }
    }
}