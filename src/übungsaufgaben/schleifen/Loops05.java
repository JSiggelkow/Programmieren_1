package übungsaufgaben.schleifen;

import java.util.Random;
import java.util.Scanner;

public class Loops05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isPlaying = true;
        int rNum = new Random().nextInt(1,101);
        int rounds = 0;

        do {
            rounds++;
            System.out.print("Tipp: ");
            int t = sc.nextInt();

            if (t != rNum) {
                String help = (t < rNum) ? "größer" : "kleiner";
                System.out.printf("Leider falsch, die gesuchte Zahl ist %s%n",help);
                System.out.print("nochmal spielen? (true/false)?: ");
                String isPA = sc.next();
                if (isPA.equals("false")){
                    isPlaying = false;
                }
            } else {
                System.out.printf("Richtig. Du hast %d Versuche benötigt%n",rounds);
            }
        } while (isPlaying);
    }
}
