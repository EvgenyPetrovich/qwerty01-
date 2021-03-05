/**
 * 2 Дано натуральное число x, выведите вторую слева цифру из числа. Если этой цифры нет,вывести ноль.
 * <p>
 * <p>
 * Например: 123 -> вывод: 2, 345 -> 4, 7 -> 0.
 */


import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = (int) Math.log10(n) + 1;
            if (num == 1) {
                System.out.println("0");
            }
            if (num == 2) {
                System.out.println(n % 10);
            }
            if (num == 3) {
                System.out.println(n % 100 / 10);
            }
            if (num == 4) {
                System.out.println(n % 1000 / 100);
            }
            if (num == 5) {
                System.out.println(n % 10000 / 1000);
            }
            if (num == 6) {
                System.out.println(n % 100000 / 10000);
            }
        }
    }
}




