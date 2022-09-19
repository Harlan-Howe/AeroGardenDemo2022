public class AerogardenRunner
{
    public static void main(String[] args)
    {
        Pod tempPod1 = new Pod();
        Pod tempPod2 = new Pod("Basil", 2);
//        Pod tempPod3 = new Pod("Parsley",100,10,2);

        System.out.println(tempPod1);
        System.out.println(tempPod2);
        System.out.println("----------------------");
        Garden myGarden = new Garden();
        System.out.println(myGarden);
        System.out.println("----------");
        myGarden.growAllPlants();
        System.out.println(myGarden);
        System.out.println("----------");
        myGarden.turnLightOff();
        myGarden.growAllPlants();
        System.out.println(myGarden);

        System.out.println("The tallest Pod is: "+myGarden.getTallestPod().getPlantType());
    }
}
