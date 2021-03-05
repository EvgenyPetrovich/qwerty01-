/**9 Рассмотрите следующий фрагмент кода.
        if (aNumber >= 0)
        if (aNumber == 0)
        System.out.println("first string");
        else System.out.println("second string");
        System.out.println("third string");
        1. Что выводит, делают Вы думаете, что код произведет если aNumber 3?
        2. Запишите тестовую программу, содержащую предыдущий фрагмент кода; сделать
        aNumber 3. Каков вывод программы? Это - то, что Вы предсказали? Объясните, почему
        вывод состоит в том, каково это; другими словами, каков поток управления для
        фрагмента кода?
        3. Используя только пробелы и разрывы строки, переформатируйте фрагмент кода, чтобы
        сделать поток управления легче понять.
        4. Используйте фигурные скобки, {и}, чтобы далее разъяснить код.*/
/** 1.. Будет   выполнены эти комманды :system.out.println("second string");
 System.out.println("third string");
 2....
 Условие не понятно..  Тоесть вместо  if (aNumber >= 0)
 if (aNumber == 0) записать,if (aNumber3 >= 0)
 if (aNumber3 == 0)??
 3...
 if (aNumber >= 0)
    if (aNumber == 0)
        System.out.println("first string");
    else
        System.out.println("second string");

 System.out.println("third string");
4...
 if (aNumber >= 0){
    if (aNumber == 0){
        System.out.println("first string");
 }else{
        System.out.println("second string");
    }
 }
 System.out.println("third string");