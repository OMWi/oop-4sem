package Composite;

import java.util.ArrayList;

public class Squad implements Unit {
    private ArrayList<Unit> units = new ArrayList<Unit>();
    private int strength = 0;

    public int getStrength() {
        return strength;
    }

    public void add(Unit unit) {
        strength += unit.getStrength();
        units.add(unit);
    }

    public void remove(Unit unit) {
        strength -= unit.getStrength();
        units.remove(unit);
    }
}
