class IceCream
{
static String iceNames[]={null,null,null,null,null,null};
static int index;

public static boolean addIce(String ice )
{
boolean isAdded = false;
if(ice!= null)
{
iceNames[index] = ice;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllIce()
{
/*for(int ice=0;ice<iceNames.length;ice++)
{
String ref=iceNames[ice];
System.out.println(ref);*/
for(String iceName:iceNames)
{
	System.out.println(iceName);
}
}

public static boolean updateIceName(String existingIceName,String updatedIceName)
{
	boolean isUpdated=false;
	for(int j=0;j<iceNames.length;j++)
	{
		if(iceNames[j].equals(existingIceName))
		{
		iceNames[j]=updatedIceName;
			isUpdated=true;
		}
	}
	return isUpdated;
}

//delete
public static boolean deleteIceName(String deletedIceName)
{
	int n=iceName.length;
	boolean isDeleted=false;
	for(int j=0;j<iceNames.length;j++)
	{
		if(iceNames[j].equals(deletedIceName))
		{
			//System.out.println("item name to be deleted is matched");
			break;
		}
	}
	if(j<n)
	{
		n=n-1;
		for(int newItem=j;newItem<n;newItem++)
		{
			//logic to remove
			iceNames[newItem]=iceNames[newItem+1]
		}
	}
		System.out.println("n");
		return n;
}
public static void getAllIce(int newLength)
{
	for(int j=0;j<newLength;j++)
	{
		System.out.println(iceName[j]);
	}
}
}
		
		
		
	
	
	



