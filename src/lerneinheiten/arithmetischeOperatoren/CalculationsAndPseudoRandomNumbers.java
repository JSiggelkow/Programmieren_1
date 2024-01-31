package lerneinheiten.arithmetischeOperatoren;

import java.util.Random;

/**
 * Arithmetische Berechnungen mit Math und Random
 *
 * @author Jonas Siggelkow
 * @version 1.0
 */
public class CalculationsAndPseudoRandomNumbers {

    public static void main(String[] args) {

        // Die Klasse Math
        double resultPow = Math.pow(2,32);  // Potenz
        double resultSqrt = Math.sqrt(8);  // Quadratwurzel
        double y = Math.round(Math.pow(125,1.0/3.0)); //dritte Wurzel
        System.out.println(y);

        // Die Klasse Random
        Random random = new Random();
        int randomNumber = random.nextInt(50,101);
        System.out.println(randomNumber);
    }
}
