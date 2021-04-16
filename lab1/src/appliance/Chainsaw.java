package appliance;

public class Chainsaw extends AbstractIndustrialApp {
    private double coefficient;

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getPower() {
        return power*coefficient;
    }

    public Chainsaw() {
        coefficient = 1.4;
    }

    public Chainsaw(int power, int price, String industry)
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
