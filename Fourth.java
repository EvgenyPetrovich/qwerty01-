/**
 * 4 Вам дано трехзначное целое число (то есть целое число от 100 до 999). Найдите сумму его
 * цифр.
 */


public class Fourth {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 999; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}