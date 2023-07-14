class soappTester
{
public static void main(String s[])
{
//object creation in java
//className referenceVariable=new Classname();
Soapp soapp =new Soapp();
soapp.name = "santhoor";
soapp.type = "hard";
soapp.colour = "orange";
soapp.price = 35.00;
soapp.toBath();

soapp soapp1 =new soapp();
soapp1.name = "medimix";
soapp1.type = "hard";
soapp1.colour = "green";
soapp1.price = 50.00;
soapp1.toBath();

System.out.println(soapp.name + " "+ soapp.type + " "+ soapp.colour);

}

}