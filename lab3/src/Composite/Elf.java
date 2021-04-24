package Composite;

public class Elf implements Unit {
    private int strength = 40;
    private String race = "Elf";

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