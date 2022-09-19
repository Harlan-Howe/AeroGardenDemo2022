public class Garden
{
    private double waterLevel;
    private boolean lightIsOn;
    private Pod pod0, pod1, pod2;

    public Garden()
    {
        System.out.println("Making a Garden.");
        waterLevel = 50;
        lightIsOn = true;
        pod0 = new Pod("Daisy",0.5);
        pod1 = new Pod("Sunflower",3.0);
        pod2 = new Pod();
    }

    public String toString()
    {
        String result = "";
        result+= "Water Level: "+waterLevel+"\n";
        result+= "Pod0: "+pod0.toString()+"\n";
        result+= "Pod1: "+pod1.toString()+"\n";
        result+= "Pod2: "+pod2.toString()+"\n";
        if (lightIsOn)
            result+= "The light is on.";
        else
            result+= "The light is off.";

        return result;
    }

    public void growAllPlants()
    {
        pod0.grow();
        pod1.grow();
        pod2.grow();
        waterLevel = waterLevel - pod0.getWaterUsagePerTick();
        waterLevel = waterLevel - pod1.getWaterUsagePerTick();
        waterLevel = waterLevel - pod2.getWaterUsagePerTick();
        if (!lightIsOn)
        {
            // pods health should be 50%.
            pod0.setHealth(50);
            pod1.setHealth(50);
            pod2.setHealth(50);
        }
    }

    public void turnLightOff()
    {
        lightIsOn = false;
    }

    public Pod getTallestPod()
    {
        int highest = pod0.getHeight();
        Pod bestPod = pod0;
        if (pod1.getHeight()>highest)
        {
            highest = pod1.getHeight();
            bestPod = pod1;
        }
        if (pod2.getHeight()>highest)
        {
            highest = pod2.getHeight();
            bestPod = pod2;
        }
        return bestPod;
    }
}
