package übungsaufgaben.objectOriented;

import java.util.Random;

public class Dice {
    private final int id;
    private int value;

    public Dice(int id) {
        this.id = id;
        value = new Random().nextInt(1,7);
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void rollTheDice() {
        value = new Random().nextInt(1,7);
        System.out.printf("%d - %d%n",id,value);
    }
}
