package appliance;

import appliance.AbstractApp;

import java.util.ArrayList;

public class Network {
    private ArrayList<AbstractApp> _appliances;

    public ArrayList<AbstractApp> getAppliances() {
        return _appliances;
    }

    public Network() {
        _appliances = new ArrayList<AbstractApp>();
    }

    public double calculatePower() {
        double totalPower = 0;
        for (AbstractApp elem : _appliances) {
            if (elem.getEnabled() == true) {
                totalPower += elem.getPower();
            }
        }
        return totalPower;
    }

    public void removeApp(int index) {
        _appliances.remove(index);
    }

    public void removeApp(AbstractApp appliance) {
        _appliances.remove(appliance);
    }

    public void addApp(AbstractApp newAppliance) {
        _appliances.add(newAppliance);
    }

}
