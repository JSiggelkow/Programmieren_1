package übungsaufgaben.objectOriented;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceCup {
    public void rollTheDices(ArrayList<Dice> dices){
        dices.forEach(Dice::rollTheDice);
    }
    public void rollTheDices(Dice[] dices){
        for (Dice d : dices){
            Arrays.stream(dices).toList().forEach(Dice::rollTheDice);
        }
    }
}
