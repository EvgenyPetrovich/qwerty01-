class main4 {
    static int counter = 0;

    public static void main(String[] args) {
        func();func();func();
        System.out.println(counter);
        
    }

    private static void func() {
        counter++;
    }

}
