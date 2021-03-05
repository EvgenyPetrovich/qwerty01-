//3 Вам дается двузначное число. Выведите его первую цифру (то есть количество десятков)

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int result = n / 10;
            System.out.println(result);
        }

    }
}