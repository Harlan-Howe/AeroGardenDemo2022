public class Pod
{
    private String plantType;
    private int health;
    private int height;
    private double waterUsagePerTick;

    // vanilla constructor
    public Pod()
    {
        System.out.println("Making a generic plant.");
        plantType = "generic plant";
        health = 100;
        height = 0;
        waterUsagePerTick = 1;
    }
    // overloaded constructor
    public Pod(String type, double usage)
    {
        System.out.println("Making a specific plant.");
        plantType = type;
        health = 100;
        height = 0;
        waterUsagePerTick = usage;
    }

    public String toString()
    {
        String result ="";
        result = result + "Type: "+plantType;
        result = result + "\thealth: "+health;
        result = result + "\theight: "+height;
        result = result + "\twater usage: "+waterUsagePerTick;

        return result;
    }

}
