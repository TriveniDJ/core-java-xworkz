class ChaiPointt
{
static String chaiAvailable[]={null,null,null,null};
static int index;
//add tea into chaiAvailable
public static boolean addChai(String chai)
{
boolean isAdded = false;
//"masala tea" !=null
if(chai!= null)
{

chaiAvailable[index] = chai;
index++;
isAdded = true;
}
else
{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllChai()
{
for(int chai=0;chai<chaiAvailable.length;chai++)
{
String ref=chaiAvailable[chai];
System.out.println(ref);
}
}
}

