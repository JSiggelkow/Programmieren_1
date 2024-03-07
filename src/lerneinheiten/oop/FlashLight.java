package lerneinheiten.oop;

public class FlashLight {
    private boolean isShining;
    private boolean isOn;
    private Battery battery;

    public void switchOn() {
        isOn = true;

        if (battery.getEnergyLevel() > 0) {
            isShining = true;
            battery.decreaseEnergyLevel();
        }
    }

    public void switchOff() {
        isOn = false;
        isShining = false;
    }

    public void changeBattery(Battery battery) {
        this.battery = battery;
    }

    public String toString(){
        return "FlashLight [isOn= " + isOn + ", isShining= " + isShining + ", battery= " + battery + "]";
    }
}
