package Composite;

import java.util.ArrayList;

public class Army implements Unit {
    private ArrayList<Unit> squads = new ArrayList<>();

    public int getStrength() {
        int strength = 0;
        for (Unit squad : squads) {
            strength += squad.getStrength();
        }
        return strength;
    }

    public int size() {
        int size = 0;
        for (Unit squad : squads) {
            size += squad.size();
        }
        return size;
    }

    public void add(Unit unit) {
        squads.add(unit);
    }

    public void remove(Unit unit) {
        squads.remove(unit);
    }

    @Override
    public String toString() {
        String data = "Total size:" + size() + '\n';
        for (Unit squad : squads) {
            data += squad.size() + " " + squad.toString() + '\n';
        }
        return data;
    }
}
