package printer;
import appliance.AbstractApp;
import appliance.AbstractHouseholdApp;
import appliance.AbstractIndustrialApp;

import java.util.ArrayList;

public class AppPrinter {

    public static void printNetwork(ArrayList<AbstractApp> apps) {
        if (apps.size() == 0) {
            return;
        }
        System.out.println("Network:");
        int index = 1;
        for (AbstractApp app : apps) {
            System.out.print(index++ + ". ");
            printApp(app);
        }
        System.out.println();
    }

    public static void printApp(AbstractApp app) {
        System.out.print("Appliance(id = " + app.getId() + "):");
        System.out.println(app);
    }

}
