class GardenTester
{
public static void main(String flower[])
{
//Garden.getfloweName();
Garden.addFlower("rose");
Garden.addFlower("jasmine");
Garden.addFlower("lotus");
Garden.addFlower("marigold");
Garden.addFlower("moonflower");





boolean value=Garden.updateFlowerName("rose","Roses");
System.out.println(value);
boolean value1=Garden.updateFlowerName("jasmin","loutus");
System.out.println(value1);

boolean value2=Garden.updateFlowerName("lotus","jasmin");
System.out.println(value2);

boolean value3=Garden.updateFlowerName("marigold","Marigoldes");
System.out.println(value3);

boolean value4=Garden.updateFlowerName("moonflower","Moonlily");
System.out.println(value4);


Garden.getAllFlower();
}
}


