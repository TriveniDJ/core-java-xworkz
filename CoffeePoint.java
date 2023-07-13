class CoffeePoint
{
static String coffeelist[]={"kothas coffee","filter coffee","nescafe","black coffee","cold coffee"};
//method
public static void getAllCoffeeAvailable()
{
System.out.println("Invokoing getAllCoffeeAvailable");
//using for loop

for(int coffee=0;coffee < CoffeeAvailable.length; coffee++)
	{
		String reference = CoffeeAvailable[coffee];
		System.out.println(reference);
	}
}
}
