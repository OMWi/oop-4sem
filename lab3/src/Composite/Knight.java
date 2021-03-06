package Composite;

public class Knight implements Unit {
    private int strength = 20;
    private String race = "Knight";

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
