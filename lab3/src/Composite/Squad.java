package Composite;

import java.util.ArrayList;

public class Squad implements Unit {
    private ArrayList<Unit> units = new ArrayList<Unit>();

    public int getStrength() {
        int strength = 0;
        for (Unit unit : units) {
            strength += unit.getStrength();
        }
        return strength;
    }

    public int size() {
        int size = 0;
        for (Unit unit : units) {
            size += unit.size();
        }
        return size;
    }

    @Override
    public String toString() {
        try {
            return units.get(0).toString();
        }
        catch (Exception exception)
        {
            return "";
        }
    }

    public void add(Unit unit) {
        //strength += unit.getStrength();
        units.add(unit);
    }

    public void remove(Unit unit) {
        //strength -= unit.getStrength();
        units.remove(unit);
    }
}
