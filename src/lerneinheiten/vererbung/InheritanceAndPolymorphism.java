package lerneinheiten.vererbung;

import lerneinheiten.oop.FlashLight;
import lerneinheiten.oop.TableLamp;

import java.util.ArrayList;
import java.util.List;

public class InheritanceAndPolymorphism {

    public static void main(String[] args) {
        TableLamp tableLamp1 = new TableLamp();
        TableLamp tableLamp2 = new TableLamp();

        ArrayList<TableLamp> tableLamps = new ArrayList<>();
        tableLamps.addAll(List.of(tableLamp1, tableLamp2));

        FlashLight flashLight1 = new FlashLight();
        FlashLight flashLight2 = new FlashLight();

        ArrayList<FlashLight> flashLights = new ArrayList<>();
        flashLights.addAll(List.of(flashLight1,flashLight2));
    }
}
