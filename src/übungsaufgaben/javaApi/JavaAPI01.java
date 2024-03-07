package übungsaufgaben.javaApi;

public class JavaAPI01 {
    public static void main(String[] args) {
        for (double i = 0.0; i < 1; i += 0.1) {
            System.out.printf("x = %.1f, sin(x) = %.1f%n",i,Math.sin(i));
        }
    }
}
