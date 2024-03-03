package übungsaufgaben.objectOriented;

public class Vehicel {

    private final String make;
    private final String model;
    private double kmh;

    public Vehicel(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public double getKmh() {
        return kmh;
    }

    public void accelerate(int kmh) {
        this.kmh += kmh;
        System.out.printf("%s %s beschleunigt auf %.1fkm/h%n", make, model, this.kmh);
    }

    public void brake(int kmh){
        this.kmh -= kmh;
        System.out.printf("%s %s bremst auf %.1fkm/h%n",make,model,this.kmh);
    }

    @Override
    public String toString(){
        return make + " " + model + " " + kmh;
    }
}
