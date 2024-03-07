package lerneinheiten.oop;

import java.util.Objects;

public class LightBulb {
    public String light;

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightBulb lightBulb = (LightBulb) o;
        return Objects.equals(light, lightBulb.light);
    }

    @Override
    public int hashCode() {
        return Objects.hash(light);
    }
}
