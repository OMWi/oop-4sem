package appliance;

import appliance.AbstractHouseholdApp;

public class Washer extends AbstractHouseholdApp {
    public double coeff;

    public void setCoeff(double coeff)
    {
        this.coeff = coeff;
    }

    public double getPower()
    {
        return coeff*power;
    }

    public Washer()
    {
        coeff = 1.2;
    }

    public Washer(int power, int price, String color)
    {
        this.power = power;
        this.price = price;
        this.color = color;
    }
}
