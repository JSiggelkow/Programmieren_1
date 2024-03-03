package übungsaufgaben.objectOriented;

import java.util.ArrayList;

public class DiceCup {
    public void rollTheDices(ArrayList<Dice> dices){
        for (Dice d : dices){
            d.rollTheDice();;
        }
    }
    public void rollTheDices(Dice[] dices){
        for (Dice d : dices){
            d.rollTheDice();;
        }
    }
}
