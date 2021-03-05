/**
 * 2 Дано натуральное число x, выведите вторую справацифру из числа. Если этой цифры нет,вывести ноль.
 * <p>
 * <p>
 * Например: 123 -> вывод: 2, 345 -> 4, 7 -> 0.
 */

import java.util.Scanner;

public class Second1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(n % 100 / 10);
                if(n<10){
                    System.out.println("0");
                }
        }
    }
}




