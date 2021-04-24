package Composite;

public class Centaur implements Unit {
    private int strength = 80;
    private String race = "centaur";

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
