package Composite;

public interface Unit {
    int getStrength();
    void add(Unit unit);
    void remove(Unit unit);
    String toString();
    int size();
}
