class Karnataka
{
static String cityNames[]={null,null,null,null,null};
static int index;
//add karnataka into cityAvailable
public static boolean addCity(String city )
{
boolean isAdded = false;

	
if(city!= null)
{

cityNames[index] = city;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllCity()
{
/*for(int city=0;city<cityNames.length;city++)
{
String ref=cityNames[city];
System.out.println(ref);*/
for(String cityName:cityNames)
{
System.out.println(cityName);	
}
}


public static boolean updateCityName(String existingCityName ,String updateCityName)
{
	boolean isUpdated=false;
	for (int cityIndex =0;cityIndex< cityNames.length;cityIndex++)
	{
		//cityNames[0] - "banglore".equal("baglore")
		if(cityNames[cityIndex].equals (existingCityName))
		{
			cityNames[cityIndex] = updateCityName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
}
			
			
			
	

