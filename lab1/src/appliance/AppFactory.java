package appliance;

public class AppFactory {

    public static AbstractApp createApp(AppType type)
    {
        switch (type)
        {
            case KETTLE:
                return new Kettle();
            case  DRILL:
                return new Drill();
            case WASHER:
                return new Washer();
            case CHAINSAW:
                return new Chainsaw();
            default:
                return null;
        }
    }
}