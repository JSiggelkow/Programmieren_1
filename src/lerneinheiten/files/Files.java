package lerneinheiten.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws FileNotFoundException {

        File myFile = new File("ressources/persons.txt");

        ArrayList<Person> x = new ArrayList<>();

        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()){
            String line = sc.nextLine();

        }

        for (Person p : x) {
            System.out.println(p);
        }

    }
}
