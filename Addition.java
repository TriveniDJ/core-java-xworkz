//addition using methods
/*class Addition
{
public static void main(String addition[])
{
add(56 , 67);
add(76 , 56);
add(56 , 98);
add(43 , 54);
add(56 , 67);
add(67 , 68);
add(50 , 98);
add(42 , 64);
add(34 , 65);
add(67 , 87);
add(16 , 58);
add(73 , 74);
}
public static void add(int z,int u)
{
System.out.println(z+u);
}
}*/


// method overloading
class Addition
{
public static void main(String addition[])
{
add(56 , 67, 34);
add(76 , 56 ,78);
add(56 , 98 ,56);
add(43 , 54 ,54);
add(56 , 67 ,65);
add(67 , 68 ,34);
add(50 , 98 ,56);
add(42 , 64 ,34);
add(34 , 65 ,89);
add(67 , 87 ,72);
add(16 , 58 ,54);
add(73 , 74 ,43);
}
public static void add(int z,int u,int v)
{
System.out.println(z+u+v);
}
}

