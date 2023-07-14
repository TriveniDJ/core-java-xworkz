class ChairTester
{
public static void main(String s[])
{
//object creation in java
//className referenceVariable=new Classname();
Chair chair =new Chair();
chair.name = "Spoorthi";
chair.type = "fiber";
chair.colour = "white";
chair.price = 235.00;
chair.toSit();

Chair chair1 =new Chair();
chair1.name = "Spoorthi";
chair1.type = "plastic";
chair1.colour = "black";
chair1.price = 500.00;
chair1.toSit();

System.out.println(chair.name + " "+ chair.type + " "+ chair.colour);

}

}