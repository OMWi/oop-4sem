package appliance;

import appliance.AbstractHouseholdApp;

public class Kettle extends AbstractHouseholdApp {
    public double coeff;

    public void setCoeff(double coeff)
    {
        this.coeff = coeff;
    }

    public double getPower()
    {
        return power*coeff;
    }

    public Kettle()
    {
        coeff =  0.9;
    }

    public Kettle(int power, int price, String color)
    {
        this.power = power;
        this.price = price;
        this.color = color;
    }
}
