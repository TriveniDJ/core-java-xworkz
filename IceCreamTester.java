class IceCreamTester
{
public static void main(String ice[])
{
//IceCream.geticeName();
IceCream.addIce("brownie");
IceCream.addIce("chocolate");
IceCream.addIce("kiwi");
IceCream.addIce("red velvet");
IceCream.addIce("avocada");
IceCream.addIce("mango");



boolean value=IceCream.updateIceName("brownie","Blackice");
System.out.println(value);
boolean value1=IceCream.updateIceName("chocolate","chocolate cream");
System.out.println(value1);

boolean value2=IceCream.updateIceName("kiwi","kiwi fruit");
System.out.println(value2);

boolean value3=IceCream.updateIceName("red velvet","redvelvet");
System.out.println(value3);

boolean value4=IceCream.updateIceName("mango","mango favor");
System.out.println(value4);

boolean value5=IceCream.updateIceName("avocada","green avocada");
System.out.println(value5);

IceCream.getAllIce();
}
}


boolean var=iceCream.deleteIceName("brownie");
IceCream.getAllIce();
int newLength=IceCream.deleteIceName()
System.out.println("calling");
IceCream.getAllIce
