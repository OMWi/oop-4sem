package appliance;

public class Washer extends AbstractHouseholdApp {
    private double coefficient;

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getPower() {
        return coefficient*power;
    }

    public Washer() {
        coefficient = 1.2;
    }

    public Washer(int power, int price, String color) {
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
