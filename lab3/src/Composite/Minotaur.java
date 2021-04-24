package Composite;

public class Minotaur implements Unit {
    private int strength = 2000;
    private String race = "Minotaur";

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
