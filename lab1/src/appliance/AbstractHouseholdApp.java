package appliance;

import appliance.AbstractApp;

public abstract class AbstractHouseholdApp extends AbstractApp {
    public String color;

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public AbstractHouseholdApp()
    {
        color = "unknown color";
    }
}
