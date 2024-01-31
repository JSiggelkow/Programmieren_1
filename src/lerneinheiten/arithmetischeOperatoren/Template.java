package lerneinheiten.arithmetischeOperatoren;

public class Template {
    public static void main(String[] args) {
        int a = 5, b = 3, c;

        // Addition
        c = a + b;
        System.out.println("a + b = " + c);

        // Subtraktion
        c = a - b;
        System.out.println("a - b = " + c);

        // Mulitplikation
        c = a * b;
        System.out.println("a * b = " + c);

        // Division
        c = a / b;
        System.out.println("a / b = " + c);

        // Division mit Nachkommastelle
        double d = (double) a / b;
        System.out.println("a / b = " + d);

        //Modulo
        c = a % b;
        System.out.println("a %  b = " + c);

        // Inkrementierung / Dekrementierung
        c = 0;
        c = 1;
        c+=1;
        c++;
        c++;
        System.out.println(c);

        // Teilen durch Null
        b = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("a/0 -> Exception -> / by 0 -> ArithmeticException");
        }

        try {
            System.out.println("double a / b : " + (double) a / b);
        } catch (Exception e) {
            System.out.println("An error occurred lol");
        }

        try {
            System.out.println(0/0.0);
            System.out.println(0/-0.0);
        } catch (Exception e) {
            System.out.println("An error occurred lol");
        }
    }
}
