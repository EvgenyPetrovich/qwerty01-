import java.util.Scanner;
public class Prostoe {
    public static void main(String[] args) {

        proverka();
    }
    static void proverka(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число:");
        int num=scanner.nextInt();
        int temp;
        boolean isProst=true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isProst = false;
                break;
            }
        }
        if(isProst) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }
}