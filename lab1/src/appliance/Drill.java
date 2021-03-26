package appliance;

import appliance.AbstractIndustrialApp;

public class Drill extends AbstractIndustrialApp {
    public double coeff;

    public void setCoeff(double coeff)
    {
        this.coeff = coeff;
    }

    public double getPower()
    {
        return coeff*power;
    }

    public Drill()
    {
        coeff = 1.05;
    }

    public Drill(int power, int price, String industry)
    {
        this.power = power;
        this.price = price;
        this.industry = industry;
    }
}
