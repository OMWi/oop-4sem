package Composite;

public class Orc implements Unit {
    private int strength = 50;
    private String race = "Orc";

    public int getStrength() {
        return strength;
    }

    public void add(Unit unit) {}

    public void remove(Unit unit) {}

    @Override
    public String toString() {
        return race;
    }

    public int size() {
        return 1;
    }
}
