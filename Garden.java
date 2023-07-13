class Garden
{
static String flowerNames[]={null,null,null,null,null};
static int index;

public static boolean addFlower(String flower )
{
boolean isAdded = false;
if(flower!= null)
{

flowerNames[index] = flower;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllFlower()
{
/*for(int flower=0;flower<flowerNames.length;flower++)
{
String ref=flowerNames[flower];
System.out.println(ref);*/
for(String flowerName:flowerNames)
{
	System.out.println(flowerName);
}
}


public static boolean updateFlowerName(String existingFlowerName,String updatedFlowerName)
{
	boolean isUpdated=false;
	for(int j=0;j<flowerNames.length;j++)
	{
		if(flowerNames[j].equals(existingFlowerName))
		{
		flowerNames[j]=updatedFlowerName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
}



