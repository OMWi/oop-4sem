import appliance.*;
import network.Network;
import network.NetworkFactory;
import printer.*;

import java.util.Scanner;

public class NetworkTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Network network = NetworkFactory.createNetwork();

        while(true) {
            char command = getCommand();
            AppPrinter.printNetwork(network.getAppliances());
            switch (command) {
                case 'q':
                    return;
                case 'a':
                    //adding app
                    AppType type = getType();
                    AbstractApp newApp = AppFactory.createApp(type);
                    getAppData(newApp);
                    network.addApp(newApp);
                    AppPrinter.printNetwork(network.getAppliances());
                    break;
                case 'r':
                    //removing app
                    int index = getIndex(network);
                    network.removeApp(index);
                    AppPrinter.printNetwork(network.getAppliances());
                    break;
                case 'p':
                    System.out.println("Consuming power: " + network.calculatePower());
                    break;
                case 'h':
                    printHelp();
                    break;
            }
        }
    }

    public static char getCommand() {
        char command;
        try {
            System.out.print("Enter command('h' - help): ");
            command = scanner.nextLine().charAt(0);
        }
        catch (Exception exception) {
            System.out.println("Error:" + exception.getLocalizedMessage());
            command = 'q';
        }
        return command;
    }

    public static void printHelp() {
        System.out.println("'q' - quit program");
        System.out.println("'a' - add new appliance to the network");
        System.out.println("'r' - remove appliance from the network");
        System.out.println("'p' - show total consuming power");
    }

    public static void getAppData(AbstractApp app) {
        try {
            System.out.println("Enter appliance data:");
            System.out.print("\tEnabled(0=no, 1=yes): ");
            int enabled = scanner.nextInt();
            if (enabled != 0 && enabled != 1) {
                throw new IndexOutOfBoundsException();
            }
            app.setEnabled(enabled != 0);
            System.out.print("\tPower: ");
            double power = scanner.nextDouble();
            scanner.nextLine();
            app.setPower(power);
            System.out.print("\tPrice: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            app.setPrice(price);
            if (app instanceof AbstractHouseholdApp) {
                System.out.print("\tColor: ");
                String color = scanner.nextLine();
                ((AbstractHouseholdApp) app).setColor(color);

            } else if (app instanceof AbstractIndustrialApp) {
                System.out.print("\tIndustry: ");
                String industry = scanner.nextLine();
                ((AbstractIndustrialApp) app).setIndustry(industry);
            }
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getLocalizedMessage());
        }
    }

    public static AppType getType() throws Exception {
        int index = 1;
        boolean error = true;
        while(error) {
            error = false;
            System.out.println("Choose appliance type:");
            for (AppType elem : AppType.values()) {
                System.out.println(index++ + ". " + elem);
            }
            try {
                index = scanner.nextInt();
                scanner.nextLine();
            }
            catch (Exception exception) {
                System.out.println("Error: " + exception.getLocalizedMessage());
                error = true;
            }
        }
        switch (index) {
            case 1:
                return AppType.DRILL;
            case 2:
                return AppType.CHAINSAW;
            case 3:
                return AppType.WASHER;
            case 4:
                return AppType.KETTLE;
            default:
                throw new Exception("Wrong type");
        }
    }

    public static int getIndex(Network network) {
        int index = 0;
        boolean error = true;
        while(error)
        try {
            error = false;
            System.out.println("Choose index");
            index = scanner.nextInt();
            scanner.nextLine();
            if (index > network.getAppliances().size() || index < 1) {
                throw new IndexOutOfBoundsException();
            }
        }
        catch (Exception exception) {
            System.out.println("Error: " + exception.getLocalizedMessage());
            error = true;
        }
        return --index;
    }
}
