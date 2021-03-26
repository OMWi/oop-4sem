package appliance;

public abstract class AbstractIndustrialApp extends AbstractApp {
    public String industry;

    public String getIndustry()
    {
        return industry;
    }

    public void setIndustry(String industry)
    {
        this.industry = industry;
    }

    public AbstractIndustrialApp()
    {
        industry = "unknown industry";
    }
}
