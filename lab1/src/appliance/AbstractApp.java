package appliance;

public abstract class AbstractApp {
    private static int ID;
    private int id;
    private boolean enabled;
    protected double power;
    protected double price;

    public int getId() {
        return id;
    }
    public boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public AbstractApp() {
        id = ID;
        ID++;
    }
}
