public class SquaresAndCubes {
    public static void main(String[] args) {
        System.out.println("number\tsquare\tcube");
        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + square + "\t" + cube);
        }
    }
}
