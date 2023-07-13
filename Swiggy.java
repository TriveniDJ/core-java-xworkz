class Swiggy
{
public static double search(String foodMenu)
{
if("chikken pork" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 99.00;
}
if("veg friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 190.00;
}
if("paneer friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 60.00;
}
if("gobi friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 40.00;
}
if("schezwan panner friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 200.00;
}
if("mushroom friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 150.00;
}
if("panner friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 20.00;
}
if("veg palav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 100.00;
}
if("mashroom pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 20.00;
}
if("paneer pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 30.00;
}
if("cashewnut pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 50.00;
}
if("kashmiri pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 160.00;
}
if("ghee rice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 180.00;
}
if("plain rice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 140.00;
}
if("chikken fry" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 390.00;
}
if("chinese chopsuey" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 190.00;
}
if("mushroom biryani" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 345.00;
}
if("paneer biryani" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 324.00;
}
if("gobi65" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 190.00;
}
if("curry" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 250.00;
}
return 00;

}

//method overloading
public static double search(String foodMenu,int quantity)
{
if("chikken pork" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 99.00* quantity;
}
if("veg friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 190.00* quantity;
}
if("paneer friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 60.00* quantity;
}
if("gobi friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 40.00* quantity;
}
if("schezwan panner friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 200.00* quantity;
}
if("mushroom friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 150.00* quantity;
}
if("panner friedrice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 20.00* quantity;
}
if("veg palav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 100.00* quantity;
}
if("mashroom pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 20.00* quantity;
}
if("paneer pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 30.00* quantity;
}
if("cashewnut pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 50.00* quantity;
}
if("kashmiri pulav" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 160.00* quantity;
}
if("ghee rice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 180.00* quantity;
}
if("plain rice" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 140.00* quantity;
}
if("chikken fry" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 390.00* quantity;
}
if("chinese chopsuey" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 190.00* quantity;
}
if("mushroom biryani" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 345.00* quantity;
}
if("paneer biryani" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 324.00* quantity;
}
if("gobi65" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 190.00* quantity;
}
if("curry" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 250.00* quantity;
}
return 0.00;
}
}
