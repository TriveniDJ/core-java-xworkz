class KFC
{
public static double search(String foodMenu)
{
if("touchdown tender" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 44.00;
}
if("sandwiches" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 100.00;
}
if("chikken strips" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00;
}
if("chikken sandwich" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 160.00;
}
if("chikken little" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00;
}
if("pizza " == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00;
}
if("chikken peri peri" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 948.00;
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
if("chikken roll" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 176.00;
}
if("double chikken role" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 225.00;
}
if("classic chikken roll" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 168.00;
}
if("bucket for two" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 599.00;
}
if("stay home bucket" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 788.00;
}
if("burger meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 299.00;
}
if("peri peri 10 leg pc" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 924.00;
}
if("peri peri 5 leg" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 628.00;
}
if("five smoky red chikken" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 528.00;
}
if("mingles bucket meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 499.00;
}
return 00;

}
}
//method overloading
public static double search(String foodMenu,int quantity)
{
if("touchdown tender" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 44.00* quantity;
}
if("sandwiches" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 100.00* quantity;
}
if("chikken strips" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 104.00* quantity;
}
if("chikken sandwich" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 160.00* quantity;
}
if("chikken little" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00* quantity;
}
if("pizza " == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 75.00* quantity;
}
if("chikken peri peri" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 948.00* quantity;
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
if("chikken roll" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 176.00* quantity;
}
if("double chikken role" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 225.00* quantity;
}
if("classic chikken roll" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 168.00* quantity;
}
if("bucket for two" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 599.00* quantity;
}
if("stay home bucket" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 788.00* quantity;
}
if("burger meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 299.00* quantity;
}
if("peri peri 10 leg pc" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 924.00* quantity;
}
if("peri peri 5 leg" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 628.00* quantity;
}
if("five smoky red chikken" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 528.00* quantity;
}
if("mingles bucket meal" == foodMenu)
{
System.out.println("Searched food name is"+foodMenu);
return 499.00* quantity;
}
return 0.00;

}
}