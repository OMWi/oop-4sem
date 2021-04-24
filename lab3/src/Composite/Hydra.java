package Composite;

public class Hydra implements Unit {
    private int strength = 5000;
    private String race = "Hydra";

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
