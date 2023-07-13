class Speaker
{
static String name="JBI" ;
static  int minVolume ;
static  int currentVolume ;
static  int maxVolume=30 ;
static boolean isConnected ;
//method
public static boolean onOrOff()
{
System.out.println("Invoking onOrOff()");
System.out.println("Parameter" + 1);
if(isConnected == false)
{
isConnected = true ;
System.out.println("Speaker is Turned onnn.....Enjoyy");
}
else if(isConnected == true)
{
isConnected = false ;
System.out.println("Speaker is Turned off.....");
}
return isConnected;
}


//increaseVolume
public static void increaseVolume()
{
	if(isConnected==true)
	{
	if(currentVolume < maxVolume)
	  {
		currentVolume = currentVolume + 1;
		System.out.println("The  fcurrentVolume is "+currentVolume);
	  }
	else{
		System.out.println("max Volume reached");
	   }
	
    }
else{
	System.out.println("Gubee...Speaker connect madu firstu");
    }
}
//decrease
public static void decreaseVolume()
{
	if(isConnected==true)
	{
	if(currentVolume > minVolume)
	{
		currentVolume = currentVolume - 1;
		System.out.println("The currentVolume is"+currentVolume);
	}
	else{
		System.out.println("min Volume reached");
	}
	
}
else{
	System.out.println("Gubee...Speaker connect madu firstu");
}
}
}
