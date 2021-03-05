public class Exper {
    public static void main(String[] args) {
        three(); //four();two();
     }
    static int three(){
        int a = 1;
        for (int i = 1; i <= 3; i++) {
            int j = 1;
            while (j <= a) {
                System.out.print(i);
                j++;
            }
            a += 1;
        }
    return a;
    }
    static int four(){
        int a = 1;
        for (int i = 1; i <= 4; i++) {
            int j = 1;
            while (j <= a) {
                System.out.print(i);
                j++;
            }
            a += 1;
        }
        return a;
    }
    static int two(){
        int a = 1;
        for (int i = 1; i <= 2; i++) {
            int j = 1;
            while (j <= a) {
                System.out.print(i);
                j++;
            }
            a += 1;
        }
        return a;
    }
}
