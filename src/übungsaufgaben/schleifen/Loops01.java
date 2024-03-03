package übungsaufgaben.schleifen;

public class Loops01 {
    public static void main(String[] args) {
        for (int a = 1; a < 11; a++) {
            for (int b = 1; b < 11; b++) {
                System.out.printf("%d x %d = %d%n", a, b, a * b);
            }
        }
    }
}
