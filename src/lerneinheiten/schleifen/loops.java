package lerneinheiten.schleifen;

/**
 * Schleifen
 *
 * @author Jonas Siggelkow
 * @version 1.0
 */
public class loops {
    /**
     * Zeigt verschieden Möglichkeiten Schleifen zu implementieren.
     * @param args
     */
    public static void main(String[] args) {

        // While Schleife
        System.out.println("While Schleife");
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }

        // Do While Schleife
        System.out.println("Do While Schleife");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<10);

        //for Schleife
        System.out.println("For Schleife");
        int[] x = new int[10];
        for (int a = 0; a < 10; a++) {
            System.out.printf("added %d to array%n",a);
            x[a] = a;
        }

        // for each Schleife
        System.out.println("For-Each schleife");
        for (int b : x) {
            System.out.println(b);
        }

        //Controlling the Loop Cycle
        System.out.println("Controlling Loop Cycle");
        for (i = 0; i<10; i++) {
            if (i==6){
                System.out.printf("i = %d -> exiting loop",i);
                break;
            }
            if (i==2) {
                System.out.printf("i = %d -> jumping over",i);
            }
            System.out.println(i);
        }

        int e = 230;
        byte f = (byte) e;
        System.out.println(f);



    }
}
