import java.util.Scanner;

/**
 * 5 В три переменные a, b и c явно записаны программистом три целых попарно неравных
 * между собой числа. Создать программу, которая переставит числа в переменных таким
 * образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
 * возрастающей.
 */


import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа:");

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a < b & a < c) {
                if (b < c) System.out.println("По возрастанию " + a + " " + b + " " + c);
                else System.out.println("По возрастанию  " + a + " " + c + " " + b);
            }
            if (b < a & b < c) {
                if (a < c) System.out.println("По возрастанию  " + b + " " + a + " " + c);
                else System.out.println("По возрастанию  " + b + " " + c + " " + a);
            }
            if (c < a & c < b) {
                if (a < b) System.out.println("По возрастанию  " + c + " " + a + " " + b);
                else System.out.println("По возрастанию  " + c + " " + b + " " + a);
            }
        }
    }
}