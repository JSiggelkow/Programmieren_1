package lerneinheiten.oop;

public class TableLamp {
    public boolean isShining;
    public boolean isConnected;
    public boolean isOn;
    public LightBulb lightBulb;

    @Override
    public String toString() {
        return "TableLamp{" +
                "isShining=" + isShining +
                ", isConnected=" + isConnected +
                ", isOn=" + isOn +
                ", lightBulb=" + lightBulb +
                '}';
    }
}
