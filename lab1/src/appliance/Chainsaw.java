package appliance;

import appliance.AbstractIndustrialApp;

public class Chainsaw extends AbstractIndustrialApp {
    public double coeff;

    public void setCoeff(double coeff)
    {
        this.coeff = coeff;
    }

    public double getPower()
    {
        return power*coeff;
    }

    public Chainsaw()
    {
        coeff = 1.4;
    }

    public Chainsaw(int power, int price, String industry)
    {
        this.power = power;
        this.price = price;
        this.industry = industry;
    }
}
