/**
 * 8 В следующей программе объясните, почему значение "6" печатается дважды подряд:
 * class PrePostDemo {
 * public static void main(String[] args){
 * int i = 3;
 * i++;
 * System.out.println(i); // "4"
 * ++i;
 * System.out.println(i); // "5"
 * System.out.println(++i); // "6"
 */


i++Сообщение(после приращения)
        ++i Pre(до приращения)
        post,если i=1,цикл увеличивается,как 1,2,3,4,n
        pre,если i=1,цикл увеличивается,как 2,3,4,5,n
