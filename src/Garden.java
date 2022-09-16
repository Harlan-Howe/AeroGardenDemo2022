public class Garden
{
    private int waterLevel;
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
}
