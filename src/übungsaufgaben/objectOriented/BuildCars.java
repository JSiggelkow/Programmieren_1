package übungsaufgaben.objectOriented;

public class BuildCars {
    public static void main(String[] args) {
        System.out.printf("Anzahl Fahrzeuge: %d%n", Vehicel.getNumVehicles());
        Vehicel porsche911 = new Vehicel("Porsche", "911");
        Vehicel porscheTaycan = new Vehicel("Porsche", "Taycan");
        Vehicel mercedsAMGC = new Vehicel("Mercedes AMG", "C-Klasse");
        System.out.printf("Anzahl Fahrzeuge: %d%n", Vehicel.getNumVehicles());
    }
}
