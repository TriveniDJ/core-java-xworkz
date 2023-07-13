class Metro
{
static String stationNames[]={null,null,null,null,null,null,null};
static int index;

public static boolean addStation(String station )
{
boolean isAdded = false;
if(station!= null)
{
stationNames[index] = station;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllStation()
{
/*for(int station=0;station<stationNames.length;station++)
{
String ref=stationNames[station];
System.out.println(ref);*/
for(String stationName:stationNames)
{
	System.out.println(stationName);
}
}

public static boolean updateMetroName(String existingStationName,String updatedStationName)
{
	boolean isUpdated=false;
	for(int j=0;j<stationNames.length;j++)
	{
		if(stationNames[j].equals(existingStationName))
		{
		stationNames[j]=updatedStationName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
}
public static boolean deleteStation(String deletedStationName) {
        System.out.println("Invoking deleteStation");
        boolean isDeleted = false;
        int stationIndex = -1;

        for (int i = 0; i < index; i++) {
            if (stationNames[i] != null && stationNames[i].equals(deletedStationName)) {
                stationIndex = i;
                break;
            }
        }

        if (flowerIndex != -1) {
            for (int i = stationIndex; i < index - 1; i++) {
                stationNames[i] = stationNames[i + 1];
            }
            stationNames[index - 1] = null;
            index--;
            isDeleted = true;
        }

        return isDeleted;
    }

    public static void getAllStationPostDeletion() {
        System.out.println("Invoking getAllStationPostDeletion\n");
        for (int stationIndex = 0; stationIndex < index; stationIndex++) {
            System.out.println(stationNames[stationindex]);
        }
        System.out.println("End of invoking getAllStationPostDeletion\n");
    }
}





