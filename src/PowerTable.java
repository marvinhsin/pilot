public class PowerTable {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        for (int a = 1, b = 2; a <= 5; a++, b++) {
            int power = 1;
            for (int i = 0; i < b; i++) {
                power *= a;
            }
            System.out.println(a + "\t" + b + "\t" + power);
        }
    }
}
