package appliance;

public class Kettle extends AbstractHouseholdApp {
    private double coefficient;

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getPower() {
        return power*coefficient;
    }

    public Kettle() {
        coefficient =  0.9;
    }

    public Kettle(int power, int price, String color) {
        this.power = power;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        String data;
        if (getEnabled() == true) {
            data = "Enabled";
        }
        else {
            data = "Disabled";
        }
        data += "  Power: " + getPower() + "  Price: " + getPrice() + "  Color: " + getColor();
        return data;
    }
}
