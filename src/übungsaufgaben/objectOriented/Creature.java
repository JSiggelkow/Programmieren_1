package übungsaufgaben.objectOriented;

public class Creature {
    private final String name;
    private final int aD;
    private int hP;

    public Creature(String name, int aD, int hP) {
        this.name = name;
        this.aD = aD;
        this.hP = hP;
    }

    public String getName() {
        return name;
    }

    public int getAD() {
        return aD;
    }

    public int getHP() {
        return hP;
    }

    public void attackCreature(Creature enemy){
        System.out.printf("%s greift %s an und macht %d Schaden %n",name,enemy.getName(),aD);
        enemy.hP -= aD;

        System.out.printf("%s hat noch %d Leben%n",enemy.getName(),enemy.getHP());
    }
}
