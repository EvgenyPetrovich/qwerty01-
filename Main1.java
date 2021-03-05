/**
 * Создать массив интов длинной 10.Заполнить рандомно от 0 до 9(включительно).Удалить 5й элемент
 */

import java.util.Random;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);
        System.out.println(cats.toString());

        cats.remove(1);

        System.out.println(cats.toString());
    }}