package Composite;

public class Cyclop implements Unit {
    private int strength = 500;
    private String race = "Cyclop";

    public int getStrength() {
        return strength;
    }

    public void add(Unit unit) {}

    public void remove(Unit unit) {}

    public int size() {
        return 1;
    }

    @Override
    public String toString() {
        return race;
    }
}
