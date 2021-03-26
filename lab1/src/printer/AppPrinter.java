package printer;
import appliance.AbstractApp;
import appliance.AbstractHouseholdApp;
import appliance.AbstractIndustrialApp;

import java.util.ArrayList;

public class AppPrinter {

    public static void printNetwork(ArrayList<AbstractApp> apps)
    {
        if (apps.size() == 0)
        {
            return;
        }
        System.out.println("appliance.Network:");
        int index = 1;
        for (AbstractApp app : apps)
        {
            System.out.print("\t" + index++ + ". ");
            printApp(app);
        }
    }

    public static void printApp(AbstractApp app)
    {
        System.out.println("Appliance(id = " + app.getId() + "):");
        if (app.getEnabled() == true)
        {
            System.out.println("\t\tEnabled");
        }
        else
        {
            System.out.println("\t\tDisabled");
        }
        System.out.println("\t\tPower: " + app.getPower());
        System.out.println("\t\tPrice: " + app.getPrice());
        if (app instanceof AbstractHouseholdApp)
        {
            System.out.println("\t\tColor: " + ((AbstractHouseholdApp) app).getColor());
        }
        else if (app instanceof AbstractIndustrialApp)
        {
            System.out.println("\t\tIndustry:" + ((AbstractIndustrialApp) app).getIndustry());
        }
        System.out.println();
    }

}
