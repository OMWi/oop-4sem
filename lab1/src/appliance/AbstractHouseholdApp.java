package appliance;

public abstract class AbstractHouseholdApp extends AbstractApp {
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AbstractHouseholdApp() {
        color = "unknown color";
    }
}
