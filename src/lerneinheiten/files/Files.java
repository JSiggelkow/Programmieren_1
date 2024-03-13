package lerneinheiten.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {

        File myFile = new File("ressources/perso");

        ArrayList<Person> x = new ArrayList<>();

        try {

            Scanner sc = new Scanner(myFile);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

            }
        } catch (FileNotFoundException e ) {
            System.out.println(e.getMessage());
        }

        for (Person p : x) {
            System.out.println(p);
        }

    }
}
