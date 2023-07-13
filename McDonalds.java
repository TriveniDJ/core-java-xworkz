class McDonalds
{
public static double search(String foodMenu)
{
if("cheesy veg nuggets" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 210.00;
}
if("chikken nuggets" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00;
}
if("chikken strips" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00;
}
if("mexican mcallo tikki" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00;
}
if("small fries" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00;
}
if("pizza mcpuff" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00;
}
if("chikken kabab" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00;
}
if("kabab" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 100.00;
}
if("burger" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 120.00;
}
if("chikken burger" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 385.00;
}
if("mc cheese burger" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 145.00;
}
if("corn and cheese burger" == foodMenu)
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
if("chikken grilled" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 164.00;
}
if("burger meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 299.00;
}
if("grilled chikken and cheese burger meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 317.00;
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
}
//method overloading
public static double search(String foodMenu,int quantity)
{
if("cheesy veg nuggets" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 210.00* quantity;
}
if("chikken nuggets" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00* quantity;
}
if("chikken strips" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00* quantity;
}
if("mexican mcallo tikki" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00* quantity;
}
if("small fries" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00* quantity;
}
if("pizza mcpuff" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00* quantity;
}
if("chikken kabab" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00* quantity;
}
if("kabab" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 100.00* quantity;
}
if("burger" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 120.00* quantity;
}
if("chikken burger" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 385.00* quantity;
}
if("mc cheese burger" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 145.00* quantity;
}
if("corn and cheese burger" == foodMenu)
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
if("chikken grilled" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 164.00* quantity;
}
if("burger meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 299.00* quantity;
}
if("grilled chikken and cheese burger meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 317.00* quantity;
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