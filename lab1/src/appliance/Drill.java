package appliance;

import appliance.AbstractIndustrialApp;

public class Drill extends AbstractIndustrialApp {
    public double coefficient;

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getPower() {
        return coefficient*power;
    }

    public Drill() {
        coefficient = 1.05;
    }

    public Drill(int power, int price, String industry)
    {
        this.power = power;
        this.price = price;
        this.industry = industry;
    }

    @Override
    public String toString() {
        String data;
        if (getEnabled() == true){
            data = "Enabled";
        }
        else {
            data = "Disabled";
        }
        data += "  Power: " + getPower() + "  Price: " + getPrice() + "  Industry: " + getIndustry();
        return data;
    }
}
