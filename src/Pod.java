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
        this.plantType = type;
        this.health = 100;
        this.height = 0;
        this.waterUsagePerTick = usage;
    }
    // another overloaded constructor
    public Pod(int hlth)
    {
        this("generic",1.0);
        health = hlth;
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

    public void grow()
    {
        height+= (int)(Math.random()*5);
    }

    // Accessor (a.k.a. "getter") for waterUsagePerTick
    public double getWaterUsagePerTick()
    {
        return waterUsagePerTick;
    }

    public String getPlantType()
    {
        return plantType;
    }

    public int getHeight()
    {
        return height;
    }
    //Modifier (a.k.a., "setter") for health
    public void setHealth(int h)
    {
        if (h>=0)
        {
            health = h;
        }
    }
}
