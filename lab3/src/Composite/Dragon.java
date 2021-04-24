package Composite;

public class Dragon implements Unit {
    private int strength = 6000;
    private String race = "Dragon";

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
